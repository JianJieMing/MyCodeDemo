package two;

import java.util.Calendar;
import java.util.Date;

/**
 * @Classname two.Main25
 * @Date 2019/7/1 16:09
 * @Created by jianjieming
 */
public class Main25 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MINUTE, 1);
        System.out.println("当前时间: " + new Date().getTime());
        System.out.println(Main25.judgeTime(c.getTime()));
    }
    /**
     * 判断时间是不是在5分钟之内
     */
    public static boolean judgeTime(Date updateDate) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar c3 = Calendar.getInstance();
        c1.setTime(updateDate);// 要判断的日期
        c2.setTime(new Date());// 初始日期
        c3.setTime(new Date());// 也给初始日期 把分钟加五
        c2.add(Calendar.MINUTE, -5);// 减去五分钟
        System.out.println("c1" + c1.getTime());
        System.out.println("c2" + c2.getTime());
        System.out.println("c3" + c3.getTime());
        if (c1.after(c2) && c1.before(c3)) {
            return true;
        } else {
            return false;
        }
    }
}