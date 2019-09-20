package bilibili.juc;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/**
 * @Classname CountDownLatchDemo
 * @Date 2019/8/2 11:18
 * @Created by jianjieming
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t国,被灭");
                countDownLatch.countDown();
            }, Objects.requireNonNull(CountryEnum.forEachCountryEnum(i)).getRetMessage()).start();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() + "\t秦帝国,一统华夏");
    }
}
