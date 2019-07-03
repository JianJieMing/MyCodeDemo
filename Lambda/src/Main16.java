import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Classname Main16
 * @Date 2019/4/2 10:01
 * @Created by jianjieming
 */
public class Main16 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");

        Map<String, Object> params = new HashMap<>();
        params.put("sectionIds", strings);


        List<String> sectionIdList = (List<String>) params.get("sectionIds");

        sectionIdList.forEach(System.out::println);

        List<Long> sectionIds = sectionIdList.stream().map(Long::valueOf).collect(Collectors.toList());

        sectionIds.forEach(System.out::println);


    }
}
