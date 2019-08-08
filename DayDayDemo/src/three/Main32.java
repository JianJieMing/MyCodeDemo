package three;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname three.Main32
 * @Date 2019/7/24 16:48
 * @Created by jianjieming
 */
public class Main32 {
    private static List<Integer> data = new ArrayList<>();
    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
//        data = Collections.synchronizedList(data);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    synchronized (lock) {
                        data.add(j);
                    }
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(data.size());
    }
}
