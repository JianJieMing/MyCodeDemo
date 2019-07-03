import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Classname Main09
 * @Date 2019/3/11 15:59
 * @Created by jianjieming
 */
public class Main09 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.YEAR, 2018);
//        cal.set(Calendar.MONTH, 11);
        Date endDate = sdf.parse("2019-06-14");
        cal.setTime(endDate);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 59);
//        cal.set(Calendar.HOUR_OF_DAY, 0);
//        cal.set(Calendar.MINUTE, 0);
//        cal.set(Calendar.SECOND, 0);
//        cal.set(Calendar.MILLISECOND, 0);
//        System.out.println(cal.getTime());
//        cal.add(Calendar.MONTH, 1);

        System.out.println(cal.getTime());
    }
}
