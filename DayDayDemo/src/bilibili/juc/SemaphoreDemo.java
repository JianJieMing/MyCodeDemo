package bilibili.juc;

import java.util.concurrent.Semaphore;

/**
 * @Classname SemaphoreDemo
 * @Date 2019/8/2 14:40
 * @Created by jianjieming
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        // 模拟三个停车位
        Semaphore semaphore = new Semaphore(5);
        // 模拟六部汽车
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "\t抢到车位");
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + "\t停车3秒后,离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }, i + "").start();
        }
    }
}
