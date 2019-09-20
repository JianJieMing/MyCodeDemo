package bilibili.thread_pool.exe;

import java.util.concurrent.*;

/**
 * @Classname ThreadPoolMain
 * @Date 2019/7/25 14:04
 * @Created by jianjieming
 */
public class ThreadPoolMain {
    public static void main(String[] args) {
        // Executor 线程池的顶级接口
        // Executors 线程池相关的工具类
        /*
        线程池五个核心参数:
            1: 核心区大小(立即执行任务的线程)
            2: 最大线程池大小(核心区加工作区)
            3|4 : 存活时间,存活时间类型
            5: 阻塞队列类型
        任务执行顺序,核心区优先执行,执行不过来了,放入阻塞队列,阻塞队列放满了,工作区线程执行.
        */

        // 最多15个线程
        ExecutorService pool = new ThreadPoolExecutor(
                3, // 核心区
                5, // 最大线程数(核心区3+工作区2=5)
                10, // 存活时间
                TimeUnit.SECONDS, // 时间类型
                new ArrayBlockingQueue<>(10)
        );

        for (int i = 0; i < 15; i++) {
            pool.execute(new MyRun(i + 1));
        }

    }

    public static class MyRun implements Runnable {

        private int index;

        public MyRun(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            System.out.println("线程标号为: " + index);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
