import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Main19
 * @Date 2019/4/10 15:58
 * @Created by jianjieming
 */
public class Main19 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        String s = StringUtils.join(list, " ");
        System.out.println(s);
    }
}
