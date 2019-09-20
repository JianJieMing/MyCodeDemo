package bilibili.thread_pool.random;

import java.util.Random;

/**
 * @Classname test.Test
 * @Date 2019/7/26 12:05
 * @Created by jianjieming
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        long timeMillis = System.currentTimeMillis();
//        for (int k = 0; k < 5; k++) {
//            new Thread(() -> {
                for (int i = 0; i < 50000000; i++) {
                    random.nextInt();
                }
//            }).start();
//        }
        long result = System.currentTimeMillis() - timeMillis;
        System.out.println(result);
    }
}
