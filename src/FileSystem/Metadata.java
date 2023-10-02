package FileSystem;
import GlobalValue.GlobalValue;
import Utilities.Converters.Resizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Metadata {
    public static byte[] GetMetaBlock(String name) {
        byte[] context = new byte[272];
        String date = new SimpleDateFormat("ddMMyyyy", Locale.getDefault()).format(new Date());
        System.arraycopy(String.format("%s/%s", GlobalValue.SLVersion, date).getBytes(), 0, context, 0, 16);
        System.arraycopy(Resizer.resizeByteByZero(name.getBytes(), 256), 0, context, 16, 256);
        return context;
    }
}