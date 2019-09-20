package test;

/**
 * @Classname Test5
 * @Date 2019/9/18 12:14
 * @Created by jianjieming
 */
class Data {

    public static int anInt;

    public void test() throws InterruptedException {
        Thread.sleep(3000);
        anInt++;
        System.out.println(Thread.currentThread().getName() + " :" + anInt);
    }

}

public class Test5 {
    public static void main(String[] args) {
        Data data = new Data();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                try {
                    data.test();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, i + "").start();
        }
    }
}
