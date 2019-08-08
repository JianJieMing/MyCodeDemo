package singleton.单例五种写法;

/**
 * @Classname SingletonOne
 * @Date 2019/7/25 16:41
 * @Created by jianjieming
 */

/**
 * 饿汉式-单例模式
 */
public class SingletonOne {

    private static SingletonOne singletonOne = new SingletonOne();

    private SingletonOne() {
    }

    public static SingletonOne getSingletonOne() {
        return singletonOne;
    }
}
