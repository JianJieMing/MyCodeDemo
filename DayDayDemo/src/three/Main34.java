package three;

/**
 * @Classname three.Main34
 * @Date 2019/7/24 18:01
 * @Created by jianjieming
 */
public class Main34 {
    public static void main(String[] args) {
        Main33 main33 = new Main33();
        main33.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (Main33.lock){
            Main33.lock.notify();
        }
    }
}
