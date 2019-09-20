package bilibili.thread_pool;

import java.util.concurrent.*;

/**
 * @Classname MyThreadPoolDemo
 * @Date 2019/8/7 9:59
 * @Created by jianjieming
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService service = new ThreadPoolExecutor(
                2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        try {
            for (int i = 1; i <= 8; i++) {
                service.execute(() -> System.out.println(Thread.currentThread().getName() + "\t 办理业务"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }

    }

    private static void MyThreadPoolOne() {
        // 一池5个处理线程
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
        // 一池1个处理线程
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        // 一池N个处理线程
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10));


        // 模拟10个用户来办理业务, 每个用户就是来自外部的一个请求线程
        try {
            for (int i = 1; i <= 10; i++) {
                fixedThreadPool.execute(() -> System.out.println(Thread.currentThread().getName() + "\t 办理业务"));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fixedThreadPool.shutdown();
        }
    }
}
