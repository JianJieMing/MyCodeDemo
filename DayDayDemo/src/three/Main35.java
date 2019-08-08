package three;

import java.util.Scanner;

/**
 * @Classname three.Main35
 * @Date 2019/7/25 9:08
 * @Created by jianjieming
 */
public class Main35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String status = scanner.nextLine();
            if ("ok".equals(status)) {
                System.out.println("程序开始执行...");
                createThread();
            }
            if ("go".equals(status)) {
                System.out.println("主线程开始通知...");
                synchronized (Main33.lock) {
                    Main33.lock.notifyAll();
                }
            }
            if ("bye".equals(status)) {
                System.out.println("程序退出...");
                break;
            }
        }
    }

    public static void createThread() {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "子线程开始执行...");
                System.out.println(Thread.currentThread().getName() + "子线程执行了一半...");
                synchronized (Main33.lock) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "子线程开始等待...");
                        Main33.lock.wait();
                        System.out.println(Thread.currentThread().getName() + "子线程恢复执行...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}