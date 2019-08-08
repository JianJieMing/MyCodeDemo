package one;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Main18
 * @Date 2019/4/4 10:59
 * @Created by jianjieming
 */
public class Main18 {
    public static void main(String[] args) {

        Map map = new HashMap<>();
        map.put("d","312");
        map.put("c","2");
        map.put("b","421");
        map.put("a","231");

        System.out.println(Main17.sortByValue(map));
    }
}
