package singleton.单例模式;

/**
 * @Classname SingletonFour
 * @Date 2019/7/25 16:50
 * @Created by jianjieming
 */

/**
 * 双重校验锁-单例模式
 */
public class SingletonFour {

    private volatile static SingletonFour singletonFour;

    private SingletonFour() {
    }

    public static SingletonFour getSingletonFour() {
        if (singletonFour == null) {
            synchronized (SingletonFour.class) {
                if (singletonFour == null) {
                    singletonFour = new SingletonFour();
                }
            }
        }
        return singletonFour;
    }

    private Object readResolve() {
        return singletonFour;
    }

}
