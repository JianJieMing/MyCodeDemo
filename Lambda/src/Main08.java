import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Main08
 * @Date 2019/3/8 16:47
 * @Created by jianjieming
 */
public class Main08 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list = Arrays.asList(1, 2, 3);
        list.forEach(System.out::println);
        System.out.println("**********");
        list = Arrays.asList(7);
        list.forEach(System.out::println);
    }
}
