package singleton;

import java.io.Serializable;

/**
 * 使用双重校验锁方式实现单例
 */
public class Singleton implements Serializable {

    // volatile关键字保证多个线程可以正确处理单件实例
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     * 要想防止序列化对单例的破坏，只要在Singleton类中定义readResolve就可以解决该问题
     * @return
     */
    private Object readResolve() {
        return singleton;
    }
}