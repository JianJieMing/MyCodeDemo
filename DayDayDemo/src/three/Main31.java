package three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @Classname three.Main31
 * @Date 2019/7/24 15:16
 * @Created by jianjieming
 */
public class Main31 {
    private static List<Integer> data = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
//        data = Collections.synchronizedList(data);
//        data = new Vector<>();
        for (int i = 0; i < 5; i++)
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    synchronized (lock) {
                        data.add(j);
                    }
                }
            }).start();
        Thread.sleep(1000);
        System.out.println(data.size());
    }

}
