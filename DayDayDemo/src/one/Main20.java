package one;

import java.util.Calendar;
import java.util.Date;

/**
 * @Classname Main20
 * @Date 2019/4/22 15:47
 * @Created by jianjieming
 */
public class Main20 {
    public static void main(String[] args) {
        Date startDate = new Date();//取时间
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 59);
        startDate = calendar.getTime();

        Date endDate = new Date();//取时间
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(endDate);
        calendar2.set(Calendar.HOUR_OF_DAY, 0);
        calendar2.set(Calendar.MINUTE, 0);
        calendar2.set(Calendar.SECOND, 0);
        calendar2.set(Calendar.MILLISECOND, 0);
        endDate = calendar2.getTime();
        System.out.println("开始时间: " + endDate + " --- " + "结束时间: " + startDate);
    }
}
