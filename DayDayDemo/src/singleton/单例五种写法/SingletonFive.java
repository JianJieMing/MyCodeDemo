package singleton.单例五种写法;

/**
 * @Classname SingletonFive
 * @Date 2019/7/25 16:54
 * @Created by jianjieming
 */

/**
 * 枚举-单例模式
 */
public enum SingletonFive {

    INSTANCE;

    private Test test;

    SingletonFive(){
        test = new Test();
    }

    public Test getSingletonFive() {
        return test;
    }
}
