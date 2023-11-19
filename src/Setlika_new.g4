grammar Setlika_new;

stmt
    : (sql_stmt_list)* EOF
    ;

sql_stmt_list
    : SCOL* stmt_line (SCOL+ stmt_line)* SCOL
    ;

stmt_line
    : create_stmt // +
    | drop_stmt // +
    | insert_stmt // +
    | select_stmt // +-
    | vacuum_stmt // +
    ;

vacuum_stmt
    : 'VACUUM'
    ;

create_stmt
    : 'CREATE' 'TABLE' existence? table_name '(' columns_def ')'
    ;

drop_stmt
    : 'DROP' 'TABLE' existence? table_name
    ;

insert_stmt
    : 'INSERT' 'INTO' table_name ('VALUES')? values
    ;

select_stmt
    : 'SELECT' result_columns 'FROM' from_body where_clause?
    ;

result_columns
    :                    result_column
    | result_columns ',' result_column
    ;

result_column
    : '*'
    | expr
    ;

from_body
    : table_name join_clauses?
    ;


join_clauses
    : join_clauses join_clause
    | join_clause
    ;

join_clause
    : cross_join
    | inner_join
    ;

cross_join
    : ',' table_name
    ;

inner_join
    : 'JOIN' table_name 'ON' expr
    ;

existence
    : 'IF' 'NOT' 'EXISTS'
    ;

table_name
    : identifier
    ;

columns_def
    : column_def (',' column_def)*
    ;

column_def
    : column_name ':' type (primary_key)?
    ;

columns_names
    :  column_name (',' column_name)*
    ;

column_name
    : identifier
    ;

type
    : 'int'
    | 'float'
    | 'str' '(' integer ')'
    | 'bool'
    ;

primary_key
    : 'PRIMARY' 'KEY'
    | 'PK'
    ;

values
    : (value ',')* value
    ;

value
    : '(' expressions ')'
    ;

expressions
    : (expr ',')* expr
    ;

expr
    : column_name
    | literal
    | '(' expr ')'
    | expr binary_operator expr
    ;

where_clause
    : 'WHERE' expr
    ;

binary_operator
    :'*'
    |'/'
    |'+'
    |'-'
    |'<='
    |'<'
    |'>='
    |'>'
    |'='
    |'!='
    |'AND'
    |'OR'
    ;

literal
    :integer
    |float
    |text
    ;

integer: NUMBER;
float: NUMBER '.' NUMBER;
text: '\'' .*? '\'';
identifier: ID;
NUMBER: [0-9]+;
ID: [a-zA-Z]+;
SCOL: ';';
WS: [ \n\r] -> skip;