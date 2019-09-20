package bilibili.juc;

/**
 * @Classname SolveABAOfCAS
 * @Date 2019/7/30 15:38
 * @Created by jianjieming
 */

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 解决CAS的ABA问题
 */
public class SolveABAOfCAS {

    static AtomicReference<Integer> atomicReference = new AtomicReference<>(100);
    static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(100, 1);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("==========以下是ABA问题的产生==========");
        new Thread(() -> {
            atomicReference.compareAndSet(100, 101);
            atomicReference.compareAndSet(101, 100);
        }, "t1").start();

        new Thread(() -> {
            try {
                // 暂停1秒钟,保证上面完成一次ABA操作
                Thread.sleep(1000);
                System.out.println(atomicReference.compareAndSet(100, 2019) + "\t" + atomicReference.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t2").start();

        Thread.sleep(2000);
        System.out.println("==========以下是ABA问题的解决==========");
        new Thread(() -> {
            int stamp = atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName() + "\t第1次版本号" + stamp);
            try {
                // 暂停一秒钟t3线程
                Thread.sleep(1000);
                atomicStampedReference.compareAndSet(100, 101, atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
                System.out.println(Thread.currentThread().getName() + "\t第2次版本号" + atomicStampedReference.getStamp());
                atomicStampedReference.compareAndSet(101, 100, atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
                System.out.println(Thread.currentThread().getName() + "\t第3次版本号" + atomicStampedReference.getStamp());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t3").start();

        new Thread(() -> {
            int stamp = atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName() + "\t第1次版本号" + stamp);
            try {
                // 暂停3秒钟t4线程,保证上面的t3线程完成一次ABA操作
                Thread.sleep(3000);
                boolean result = atomicStampedReference.compareAndSet(100, 2019, stamp, stamp + 1);
                System.out.println(Thread.currentThread().getName() + "\t修改成功否: " + result + "\t当前最新实际版本号: " + atomicStampedReference.getStamp());
                System.out.println(Thread.currentThread().getName() + "\t当前实际最新值: " + atomicStampedReference.getReference());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t4").start();

    }
}
