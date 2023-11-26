package until;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class AsciiArtTable {

    private static String appendToLength(final Object subject, final int length) {
        final String subjectString = subject == null ? "" : subject.toString();
        if (subjectString.length() < length) {
            return subjectString + StringUtils.repeat(' ', length - subjectString.length());
        }
        return subjectString;
    }

    private static String prependToLength(final Object subject, final int length) {
        final String subjectString = subject == null ? "" : subject.toString();
        if (subjectString.length() < length) {
            return StringUtils.repeat(' ', length - subjectString.length()) + subjectString;
        }
        return subjectString;
    }

    private String borderCharacters;
    private final List<Object> contentCols;
    private final List<Object> headerCols;
    private final List<Object> headlines;
    private int maxColumnWidth = 80;
    private boolean minimiseHeight = false;
    private final int padding;

    public AsciiArtTable() {
        this(1);
    }

    public AsciiArtTable(final int padding) {
        this(padding, "╭ ─ ┬ ╮ │ ├ ─ ┬ ┤ ┼ ├ ┤ │ ╰ ┴ ╯ ┼".replaceAll(" ", ""));
    }

    public AsciiArtTable(final int padding, final String borderCharacters) {
        this.headerCols = new ArrayList<>();
        this.contentCols = new ArrayList<>();
        this.headlines = new ArrayList<>();
        this.padding = padding;
        this.borderCharacters = borderCharacters;
    }

    public void add(final List<Object> contentCols) {
        this.contentCols.addAll(contentCols);
    }

    public void add(final Object... contentCols) {
        add(new ArrayList<>(Arrays.asList(contentCols)));
    }

    public void addHeaderCols(final List<Object> headerCols) {
        this.headerCols.addAll(headerCols);
    }

    public void addHeaderCols(final Object... headerCols) {
        addHeaderCols(new ArrayList<>(Arrays.asList(headerCols)));
    }

    public void addHeadline(final Object headline) {
        this.headlines.add(headline);
    }

    private boolean alignLeft(final List<List<String>> linesContents, final int col) {

        boolean result = false;
        if (linesContents.size() > 1) {
            // are lines > first line all empty?
            for (List<String> lineContents : linesContents) {
                if (linesContents.indexOf(lineContents) != 0 && !lineContents.get(col).trim().isEmpty()) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public void clear() {
        headerCols.clear();
        contentCols.clear();
        headlines.clear();
    }

    private int[] getColWidths() {
        int[] result = new int[headerCols.size()];
        int col = 0;
        while (col < headerCols.size()) {
            int length = headerCols.get(col).toString().length();
            result[col] = Math.min(length, maxColumnWidth);
            col++;
        }
        int index = 0;
        while (index < contentCols.size()) {
            col = index % headerCols.size();
            final String content = contentCols.get(index) == null ? "" : contentCols.get(index).toString();
            if (content.length() > result[col]) {
                int length = contentCols.get(index).toString().length();
                result[col] = Math.min(length, maxColumnWidth);
            }
            index++;
        }
        return result;
    }

    public String getOutput() {
        // prepare data
        while (contentCols.size() % headerCols.size() != 0) {
            contentCols.add("");
        }
        // build header
        StringBuilder result = new StringBuilder();
        if (headlines.isEmpty()) {
            result.append(row(borderCharacters.charAt(0), borderCharacters.charAt(1), borderCharacters.charAt(2), borderCharacters.charAt(3))).append(System.lineSeparator());
        } else {
            result.append(row(borderCharacters.charAt(0), borderCharacters.charAt(1), borderCharacters.charAt(1), borderCharacters.charAt(3))).append(System.lineSeparator());
            for (Object headline : headlines) {
                result.append(rowHeadline(headline.toString(), borderCharacters.charAt(4), borderCharacters.charAt(4)));
                if (headlines.indexOf(headline) == headlines.size() - 1) {
                    if (outputOfHeaderColsIsRequested()) {
                        result.append(row(borderCharacters.charAt(5), borderCharacters.charAt(6), borderCharacters.charAt(7), borderCharacters.charAt(8))).append(System.lineSeparator());
                    } else {
                        result.append(row(borderCharacters.charAt(10), borderCharacters.charAt(1), borderCharacters.charAt(2), borderCharacters.charAt(11))).append(System.lineSeparator());
                    }
                } else if (!minimiseHeight) {
                    result.append(row(borderCharacters.charAt(5), borderCharacters.charAt(6), borderCharacters.charAt(6), borderCharacters.charAt(8))).append(System.lineSeparator());
                }
            }
        }
        if (outputOfHeaderColsIsRequested()) {
            result.append(row(headerCols, borderCharacters.charAt(4), borderCharacters.charAt(12), borderCharacters.charAt(4))).append(System.lineSeparator());
            result.append(row(borderCharacters.charAt(10), borderCharacters.charAt(1), borderCharacters.charAt(9), borderCharacters.charAt(11))).append(System.lineSeparator());
        }
        int col = 0;
        while (col < contentCols.size()) {
            result.append(row(contentCols.subList(col, col + headerCols.size()), borderCharacters.charAt(4), borderCharacters.charAt(12), borderCharacters.charAt(4))).append(System.lineSeparator());
            col += headerCols.size();
            if (col == contentCols.size()) {
                result.append(row(borderCharacters.charAt(13), borderCharacters.charAt(1), borderCharacters.charAt(14), borderCharacters.charAt(15))).append(System.lineSeparator());
            } else if (!minimiseHeight) {
                result.append(row(borderCharacters.charAt(5), borderCharacters.charAt(6), borderCharacters.charAt(16), borderCharacters.charAt(8))).append(System.lineSeparator());
            }
        }
        return result.toString();
    }

    private int getTableLength() {
        final int[] colWidths = getColWidths();
        int result = 0;
        for (int colWidth : colWidths) {
            result += colWidth + 2 * padding;
        }
        return result + colWidths.length + 1;
    }

    public void minimiseHeight() {
        minimiseHeight = true;
    }

    private boolean outputOfHeaderColsIsRequested() {
        for (Object headerCol : headerCols) {
            if (!headerCol.toString().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public void print(final PrintStream printStream) {
        printStream.print(getOutput());
    }

    private String row(final char left, final char middle, final char columnSeparator, final char right) {
        final int[] colWidths = getColWidths();
        StringBuilder result = new StringBuilder(left + "");
        int col = 0;
        while (col < headerCols.size()) {
            result.append(StringUtils.repeat(middle, padding + colWidths[col] + padding));
            col++;
            result.append(col == headerCols.size() ? right : columnSeparator);
        }
        return result.toString();
    }

    private String row(final List<Object> contents, final char left, final char columnSeparator, final char right) {
        final int[] colWidths = getColWidths();
        StringBuilder result = new StringBuilder();
        List<List<String>> linesContents = splitToMaxLength(contents, maxColumnWidth);
        for (List<String> lineContents : linesContents) {
            int col = 0;
            result.append(left);
            while (col < headerCols.size()) {
                if (alignLeft(linesContents, col)) {
                    result.append(StringUtils.repeat(' ', padding));
                    result.append(appendToLength(lineContents.get(col), padding + colWidths[col]));
                } else {
                    result.append(prependToLength(lineContents.get(col), padding + colWidths[col]));
                    result.append(StringUtils.repeat(' ', padding));
                }
                col++;
                result.append(col == headerCols.size() ? right : columnSeparator);
            }
            if (linesContents.indexOf(lineContents) != linesContents.size() - 1) {
                result.append(System.lineSeparator());
            }
        }
        return result.toString();
    }

    private String rowHeadline(final String headline, final char left, final char right) {
        final int tableLength = getTableLength();
        final int contentWidth = tableLength - (2 * padding) - 2;
        final List<String> headlineLines = new ArrayList<>();
        final String[] headlineWords = headline.split(" ");
        List<String> rowWords = new ArrayList<>();
        for (String headlineWord : headlineWords) {
            if ((StringUtils.join(rowWords, ' ') + ' ' + headlineWord).length() > contentWidth) {
                headlineLines.add(StringUtils.join(rowWords, ' '));
                rowWords.clear();
            }
            rowWords.add(headlineWord);
        }
        if (!rowWords.isEmpty()) {
            headlineLines.add(StringUtils.join(rowWords, ' '));
        }
        // build result
        StringBuilder result = new StringBuilder();
        for (String headlineLine : headlineLines) {
            result.append(left).append(StringUtils.repeat(' ', padding)).append(StringUtils.rightPad(headlineLine, tableLength - padding - 2)).append(right).append(System.lineSeparator());
        }
        return result.toString();
    }

    public void setBorderCharacters(final String borderCharacters) {
        this.borderCharacters = borderCharacters;
    }

    public void setMaxColumnWidth(final int maxColumnWidth) {
        this.maxColumnWidth = maxColumnWidth;
    }

    public void setNoHeaderColumns(int withColumns) {
        this.headerCols.clear();
        while (withColumns-- > 0) {
            this.headerCols.add("");
        }
    }

    // XXX omg ...
    private List<List<String>> splitToMaxLength(final List<Object> subjects, final int maxLength) {
        final List<List<String>> result = new ArrayList<>();
        int countRows = 1;
        for (Object subject : subjects) {
            if (subject.toString().length() > maxLength) {
                int countRowsForThisSubject = 1;
                final String[] words = subject.toString().split(" ");
                final List<String> columnWords = new ArrayList<>();
                for (String word : words) {
                    if ((StringUtils.join(columnWords, ' ') + ' ' + word).length() > maxLength) {
                        countRowsForThisSubject++;
                        columnWords.clear();
                    }
                    columnWords.add(word);
                }
                if (countRows < countRowsForThisSubject) {
                    countRows = countRowsForThisSubject;
                }
            }
        }
        final List<List<String>> cellContents = new ArrayList<>();
        for (Object subject : subjects) {
            String content = subject.toString();
            final List<String> cellContentLines = new ArrayList<>();
            if (content.length() > maxLength) {
                final String[] words = content.split(" ");
                final List<String> cellContentLineWords = new ArrayList<>();
                for (String word : words) {
                    if ((StringUtils.join(cellContentLineWords, ' ') + ' ' + word).length() > maxLength) {
                        final String cellContentLine = StringUtils.join(cellContentLineWords, ' ');
                        cellContentLines.add(cellContentLine);
                        cellContentLineWords.clear();
                    }
                    cellContentLineWords.add(word);
                }
                cellContentLines.add(StringUtils.join(cellContentLineWords, ' '));
            } else {
                cellContentLines.add(content);
            }
            while (cellContentLines.size() < countRows) {
                cellContentLines.add("");
            }
            cellContents.add(cellContentLines);
        }

        int row = 0;
        while (row < countRows) {
            final List<String> lineOverColumns = new ArrayList<>();
            for (int col = 0; col < headerCols.size(); col++) {
                lineOverColumns.add(cellContents.get(col).get(row));
            }
            result.add(lineOverColumns);
            row++;
        }
        return result;
    }
}