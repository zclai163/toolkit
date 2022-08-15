package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static final String YYYYMMDD = "yyyyMMdd";
    private static final String YYYY_MM_DD = "yyyy_MM_dd";

    public static void main(String[] args) throws ParseException {
        System.out.println(longToDate(20200816L));
    }

    public static String longToDate(Long l) throws ParseException {
        SimpleDateFormat yyyyMMdd = new SimpleDateFormat(YYYYMMDD);
        SimpleDateFormat yyyy_MM_dd = new SimpleDateFormat(YYYY_MM_DD);
        Date date = yyyyMMdd.parse(l.toString());
        return yyyy_MM_dd.format(date);
    }
}
