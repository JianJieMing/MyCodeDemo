import java.util.Arrays;
import java.util.List;

public class Main06 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,1,null,2,3,4,null,5,6,7,8,9,10);
        System.out.println("sum is: "
                + nums.stream().filter(num -> num != null).distinct()
                        .mapToInt(num -> num * 2).peek(System.out::println)
                        .skip(2).limit(4).sum());
    }
}
