package bilibili.juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Classname BlockingQueueDemo
 * @Date 2019/8/2 16:41
 * @Created by jianjieming
 */
public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
//        List list = new ArrayList();
        BlockingQueue<String> queue = new ArrayBlockingQueue(3);
        // 抛异常组
//        System.out.println(queue.add("a"));
//        System.out.println(queue.add("b"));
//        System.out.println(queue.add("c"));
//
//        System.out.println(queue.element());
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        // 不抛异常
//        System.out.println(queue.offer("a"));
//        System.out.println(queue.offer("b"));
//        System.out.println(queue.offer("c"));
//        System.out.println(queue.offer("d"));
//
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());

        // 阻塞的
        queue.put("a");
        queue.put("b");
        queue.put("c");
//        System.out.println("===========");
//        queue.put("d");

        queue.take();
        queue.take();
        queue.take();
//        queue.take();

        // 超时
        System.out.println(queue.offer("a", 2, TimeUnit.SECONDS));
        System.out.println(queue.offer("b", 2, TimeUnit.SECONDS));
        System.out.println(queue.offer("c", 2, TimeUnit.SECONDS));
        System.out.println(queue.offer("d", 2, TimeUnit.SECONDS));

    }
}
