package two;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname two.Main27
 * @Date 2019/7/9 11:54
 * @Created by jianjieming
 */
public class Main27 {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No one sum solution");


//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                System.out.println("nums[j]: " + nums[j] + " nums[i]:" + nums[i]);
//                if (nums[j] + nums[i] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No one sum solution");
    }
}
