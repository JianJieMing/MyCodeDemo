import java.text.DecimalFormat;

/**
 * @Classname Main15
 * @Date 2019/3/28 20:55
 * @Created by jianjieming
 */
public class Main15 {
    public static void main(String[] args) {
        Double a = 1031.141;
        Double b = 2311.141;
        Double c = b / a;
        DecimalFormat df = new DecimalFormat("#.00");
        Double format = Double.valueOf(df.format(c));
        System.out.println(format);

    }
}
