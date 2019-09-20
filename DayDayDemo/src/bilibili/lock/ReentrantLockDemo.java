package bilibili.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname ReentrantLockDemo
 * @Date 2019/8/1 11:54
 * @Created by JianJieMing
 */
class Phone implements Runnable {

    public synchronized void sendSMS() {
        System.out.println(Thread.currentThread().getName() + "\t invoked sendSMS()");
        sendEmail();
    }

    public synchronized void sendEmail() {
        System.out.println(Thread.currentThread().getName() + "\t invoked sendEmail()");
    }

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        getLock();
    }

    public void getLock() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoked getLock()");
            setLock();
        } finally {
            lock.unlock();
        }
    }

    public void setLock() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoked setLock()");
        } finally {
            lock.unlock();
        }
    }
}

/**
 * 可重入锁也叫递归锁，指的是同一线程外层函数获得锁之后，内层递归函数仍然能获取该锁的代码，在同一线程在外层方法获取锁的时候，在进入内层方法会自动的获取锁。
 * 也就是说，线程可以进入任何一个已经拥有了锁的，所同步的代码块
 * <p>
 * case One synchronized就是一个典型的可重入锁
 * t1	 invoked sendSMS()      t1线程在外层方法获取锁的时候
 * t1	 invoked sendEmail()    t1线程在进入内层方法会自动获取锁
 * <p>
 * case Two ReentrantLock就是一个典型的可重入锁
 */
public class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        // synchronized
        new Thread(phone::sendSMS, "t1").start();

        Thread.sleep(1000);

        // ReentrantLock
        new Thread(new Phone(), "t2").start();
    }
}
