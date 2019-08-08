package three;

import java.util.Arrays;

/**
 * @Classname Main37
 * @Date 2019/7/26 16:10
 * @Created by jianjieming
 */
public class Main37 {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,6,2,8,7,9,10};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
        long timeMillis = System.currentTimeMillis();
        Arrays.parallelSort(arr);
//        Arrays.stream(arr).parallel().sorted().forEach(System.out::println);
        long result = System.currentTimeMillis() - timeMillis;
        System.out.println(Arrays.toString(arr));
    }
}
