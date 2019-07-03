import java.sql.Timestamp;
import java.util.Calendar;

/**
 * @Classname Main14
 * @Date 2019/3/21 13:41
 * @Created by jianjieming
 */
public class Main14 {
    public static void main(String[] args) {

        Timestamp fromDt = null;
        Timestamp toDt = null;
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        fromDt = new Timestamp(cal.getTime().getTime());
        System.out.println(cal.getTime());
        cal.add(Calendar.MONTH, 1);

        toDt = new Timestamp(cal.getTime().getTime());
        System.out.println(cal.getTime());

    }
}
