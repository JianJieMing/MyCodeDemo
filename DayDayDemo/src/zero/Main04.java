package zero;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main04 {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().filter(num -> num > 0).limit(3).sorted().forEach(System.out::println);
        List<String> strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // 获取空字符串的数量
        long count = strings1.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println(count);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选列表: " + filtered);

        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);


        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
        int sum = values.stream().reduce(0, (s,r) -> s+r);
        System.out.println(sum);

    }
}
