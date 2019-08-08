package singleton;

/**
 * @Classname singleton.StaticSingleton
 * @Date 2019/7/24 16:50
 * @Created by jianjieming
 */
public class StaticSingleton {

    private static class SingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton() {}

    public static StaticSingleton getStaticSingleton(){
        return SingletonHolder.INSTANCE;
    }
}
