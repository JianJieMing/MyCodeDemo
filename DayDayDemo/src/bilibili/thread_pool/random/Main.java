package bilibili.thread_pool.random;

import java.util.concurrent.*;

/**
 * @Classname Main
 * @Date 2019/7/26 12:03
 * @Created by jianjieming
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int num = 0;
        ExecutorService pool = Executors.newFixedThreadPool(5);
        Future[] futures = new Future[5];
        for (int i = 0; i < 5; i++) {
            Future<?> submit = pool.submit(new RandomCallable());
            futures[i] = submit;
        }
        for (Future future : futures) {
            Object result = future.get();
            num += Integer.valueOf(String.valueOf(result));
        }
        System.out.println(num);
        pool.shutdown();
    }
}
