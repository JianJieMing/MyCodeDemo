package bilibili.juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Classname PoolMain
 * @Date 2019/7/25 10:29
 * @Created by jianjieming
 */
public class PoolMain {
    public static void main(String[] args) {

        // 为了解决多线程模型下的i++不是原子性的问题,可以使用
        AtomicInteger integer = new AtomicInteger(3);
        System.out.println(integer);
        integer.getAndIncrement();
        int i = integer.get();
        System.out.println(i);
//        MyThreadPool threadPool = new MyThreadPool(3);
//        List<Runnable> runnables = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            final int index = i;
//            Runnable runnable = () -> {
//                System.out.println(Thread.currentThread().getName() + "的任务: " + index);
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            };
//            runnables.add(runnable);
//        }
//        threadPool.executeList(runnables);
//        threadPool.start();


        // 创建三个线程重一个队列中拿任务执行
        /*
        for (int t = 0; t < 3; t++) {
            SubThread subThread = new SubThread();
            subThread.start();
        }
        */

        // 用同一个线程,按顺序执行10个任务
        /*
        for (int i = 0; i < 10; i++) {
            final int index = i;
            SubThread.addTask(() -> {
                System.out.println(Thread.currentThread().getName() + "的任务: " + index);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        */
        // 阻塞队列 先进先出 两个入口 一个进一个出 吃了拉
        // 栈 后进先出 一个口 吃了吐
        /*
        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        queue.add(() -> {});
        queue.add(() -> {});
        queue.add(() -> {});
        */
        // 根据放进去的顺序取值,先进先出.
        /*
        Runnable take1 = queue.take();
        Runnable take2 = queue.take();
        Runnable take3 = queue.take();
        // 取完了,但是还可以取,程序阻塞,等待队列中添加新值后继续取值.
        Runnable take4 = queue.take();
        */
    }
}
