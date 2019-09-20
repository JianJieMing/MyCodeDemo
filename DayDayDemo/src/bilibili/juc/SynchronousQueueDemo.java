package bilibili.juc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * SynchronousQueue(同步队列)没有容量。
 * 与其他的BlockingQueue不同，SynchronousQueue是一个不存储元素的BlockingQueue。
 * 每一个put操作必须要等待一个take操作，否则不能继续添加元素，反之亦然。
 *
 * @Classname SynchronousQueueDemo
 * @Date 2019/8/5 14:53
 * @Created by jianjieming
 */
public class SynchronousQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();

        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "\tput 1");
                queue.put("1");
                System.out.println(Thread.currentThread().getName() + "\tput 2");
                queue.put("2");
                System.out.println(Thread.currentThread().getName() + "\tput 3");
                queue.put("3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AAA").start();

        new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + "\t" + queue.take());

                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + "\t" + queue.take());

                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + "\t" + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "BBB").start();

    }
}
