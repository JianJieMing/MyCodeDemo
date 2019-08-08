package two;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname two.Main26
 * @Date 2019/7/4 9:25
 * @Created by jianjieming
 */
public class Main26 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
//        long abs = Math.abs(System.currentTimeMillis() / 1000 - System.currentTimeMillis() / 1000);

//        long time = new Date().getTime();
//        System.out.println(new Date(time));
//        System.out.println(new Date(new Date().getTime() / 1000) + "  " + System.currentTimeMillis());
//        System.out.println(Math.abs(System.currentTimeMillis() / 1000 - time) + "@@" + new Date(1560642004685l));
        if (Math.abs(System.currentTimeMillis() / 1000 - ((System.currentTimeMillis() / 1000) - 60)) > 5 * 60) {
            System.out.println("失败");
        } else {
            System.out.println("成功");
        }
        System.out.println(System.currentTimeMillis() / 1000);
        System.out.println(formatter.format(new Date()));
        System.out.println(formatter.format(new Date(System.currentTimeMillis())) + "  " + formatter.format(new Date(System.currentTimeMillis() - 10000)));


    }
}