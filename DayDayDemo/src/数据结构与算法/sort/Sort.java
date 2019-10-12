package 数据结构与算法.sort;

import java.util.Arrays;

/**
 * @Classname Sort
 * @Date 2019/10/12 11:38
 * @Created by jianjieming
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        bubbleSort(arr);
//        selectSort(arr);
//        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒号排序
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
            if (!flag) {
                break;
            } else {
                flag = false;
            }
//            System.out.printf("冒号排序: 第%d轮,遍历的结果为: \n", i + 1);
//            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int minVal = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (minVal > arr[j]) {
                    minVal = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = minVal;
            }
//            System.out.printf("选择排序: 第%d轮,遍历的结果为: \n", i + 1);
//            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * 插入排序
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        // 2 1 3
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i]; // 1
            int insertIndex = i - 1; // 下标 0 值 2
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) { // 1 < 2
                arr[insertIndex + 1] = arr[insertIndex]; // 把当前值1改为上一个值2 结果: 2 2 3
                insertIndex--; // -1
            }
            if (insertIndex + 1 != i) { // -1 + 1 != 1 false
                arr[insertIndex + 1] = insertVal; // 下标为0的值2改为上面记录的值1 2 2 => 1 2
            }
//            System.out.printf("插入排序: 第%d轮,遍历的结果为: \n", i);
//            System.out.println(Arrays.toString(arr));
        }
    }

}

