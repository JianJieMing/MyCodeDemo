package singleton;

/**
 * @Classname singleton.Instance
 * @Date 2019/7/24 16:29
 * @Created by jianjieming
 */
public class Instance {
    private volatile static Instance INSTANCE;
    private Instance() {}
    public static Instance getSingleton() {
        if (INSTANCE == null) {
            synchronized (Instance.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Instance();
                }
            }
        }
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static void test () {
        System.out.println("开始继续执行......");
        INSTANCE.notify();
    }
}