package bilibili.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("*****" + Thread.currentThread().getName() + " come in Callable*****");
        Thread.sleep(2000);
        return 1024;
    }
}

/**
 * @Classname CallableDemo
 * @Date 2019/8/6 15:00
 * @Created by jianjieming
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        FutureTask<Integer> futureTask2 = new FutureTask<>(new MyThread());
        new Thread(futureTask, "AA").start();
//        new Thread(futureTask2, "BB").start();
//        System.out.println(Thread.currentThread().getName() + " ******* " + futureTask.get());
        int result01 = 100;
        // 要求获得Callable线程的计算结果, 如果没有计算完成, 会导致堵塞, 直到计算完成
        int result02 = futureTask.get();
        System.out.println("***result: " + (result01 + result02));

        // 可以判断任务做没做完
//        while (!futureTask.isDone()) {
//
//        }
    }
}
