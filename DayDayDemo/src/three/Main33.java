package three;

import sun.applet.Main;

/**
 * @Classname three.Main33
 * @Date 2019/7/24 17:49
 * @Created by jianjieming
 */
public class Main33 extends Thread {

    static final Object lock = new Object();

    @Override
    public void run() {
        super.run();
        test();
    }

    private void test() {
        System.out.println("子线程开始工作");
        System.out.println("干了一半");
        synchronized (lock) {
            try {
                System.out.println("子线程开始等待......");
                lock.wait();
                System.out.println("子线程恢复执行");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
