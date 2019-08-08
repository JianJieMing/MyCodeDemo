package bilibili.thread_pool.大哥与小弟;

import java.util.concurrent.*;

/**
 * @Classname Main
 * @Date 2019/7/26 11:31
 * @Created by jianjieming
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        FutureTask<Integer> futureTask = new FutureTask<>(new IceCallable(10));
        System.out.println("二弟拿着10块钱买雪糕去了");
        new Thread(futureTask).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("大哥打游戏中...");
            Thread.sleep(300);
        }
        Integer money = futureTask.get();
        System.out.println("小弟买完雪糕,还剩" + money + "元");

        // 使用线程池获取子线程执行完返回的结果
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Future<?> future = pool.submit(new IceCallable(10));
        Object result = future.get();
        System.out.println(result);
    }
}
