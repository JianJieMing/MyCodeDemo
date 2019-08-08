package one;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Classname Main11
 * @Date 2019/3/13 11:27
 * @Created by jianjieming
 */
public class Main11 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 5);
//        cal.add(Calendar.MONTH, 1);
        System.out.println(cal.getTime());
        Date date = new Date(cal.getTime().getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String param = sdf.format(date);// 参数时间
        String now = sdf.format(new Date());// 当前时间
        if (param.equals(now)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
