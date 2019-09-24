package singleton.单例模式;

/**
 * @Classname SingletonThree
 * @Date 2019/7/25 16:48
 * @Created by jianjieming
 */

/**
 * 静态内部类-单例模式
 */
public class SingletonThree {

    private SingletonThree() {
    }

    private static class StaticSingletonThree {
        private static final SingletonThree singletonThree = new SingletonThree();
    }

    public static SingletonThree getSingletonThree() {
        return StaticSingletonThree.singletonThree;
    }

}
