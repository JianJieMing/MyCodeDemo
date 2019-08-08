package zero;

import java.text.DecimalFormat;

/**
 * @Classname Main07
 * @Date 2019/3/6 14:49
 * @Created by jianjieming
 */
public class Main07 {
    public static void main(String[] args) {
        String result="";//接受百分比的值
        double tempresult = 1.5 / 3;
        DecimalFormat df = new DecimalFormat("0.00%");    //##.00%   百分比格式，后面不足2位的用0补齐
        result= df.format(tempresult);
        System.out.println("百分比： " + result);

        Integer i1 = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(i1 == i2);

        Integer i3 = 126;
        Integer i4 = 126;
        int i5 = 126;
        System.out.println(i3 == i4);
        System.out.println(i3 == i5);

        Integer i6 = 128;
        Integer i7 = 128;
        int i8 = 128;

        System.out.println(i6 == i7);
        System.out.println(i6 == i8);
    }
}
