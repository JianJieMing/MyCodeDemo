package singleton.单例模式;

/**
 * @Classname SingletonTwo
 * @Date 2019/7/25 16:45
 * @Created by jianjieming
 */

/**
 * 懒汉式-单例模式
 */
public class SingletonTwo {

    private static SingletonTwo singletonTwo;

    private SingletonTwo() {
    }

    public static synchronized SingletonTwo getSingletonTwo() {
        if (singletonTwo == null) {
            singletonTwo = new SingletonTwo();
        }
        return singletonTwo;
    }

}
