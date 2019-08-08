package two;

import java.util.*;

/**
 * @Classname two.Main29
 * @Date 2019/7/23 10:39
 * @Created by jianjieming
 */
public class Main29 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("3");

        Set<String> set = new HashSet<>(list);
        System.out.println(set);

//        list.removeIf("1"::equals);
//
//        for (String item : list) {
//            if ("2".equals(item)) {
//                list.remove(item);
//            }
//        }
//        System.out.println(list);

        Map<String, String> map = new HashMap<>(3);
        map.put("1", "一");
        map.put("2", "二");
        map.put("3", "三");

        Collection<String> values = map.values();
        System.out.println(values);

        for (String s : map.keySet()) {
            System.out.format("key: %s, value: %s ", s, map.get(s));
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.format("key: %s, value: %s ", key, value);
        }

        map.forEach((key, value) -> System.out.format("key: %s, value: %s ", key, value));
    }
}
