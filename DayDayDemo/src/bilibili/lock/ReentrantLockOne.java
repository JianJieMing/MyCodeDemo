package bilibili.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname ReentrantLockOne
 * @Date 2019/8/1 11:27
 * @Created by jianjieming
 */
public class ReentrantLockOne {
    public static void main(String[] args) {
        // 默认是非公平锁
        Lock lock1 = new ReentrantLock();
        // 公平锁
        Lock lock2 = new ReentrantLock(true);

        // synchronized是非公平锁
    }
}
