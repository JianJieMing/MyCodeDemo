package singleton.单例模式;

/**
 * @Classname Main
 * @Date 2019/7/25 17:07
 * @Created by jianjieming
 */
public class Main {
    public static void main(String[] args) {

        // 饿汉式-单例模式 SingletonOne
        SingletonOne singletonOne1 = SingletonOne.getSingletonOne();
        SingletonOne singletonOne2 = SingletonOne.getSingletonOne();
        System.out.println(singletonOne1 == singletonOne2);

        // 懒汉式-单例模式 SingletonTwo
        SingletonTwo singletonTwo1 = SingletonTwo.getSingletonTwo();
        SingletonTwo singletonTwo2 = SingletonTwo.getSingletonTwo();
        System.out.println(singletonTwo1 == singletonTwo2);

        // 静态内部类-单例模式 SingletonThree
        SingletonThree singletonThree1 = SingletonThree.getSingletonThree();
        SingletonThree singletonThree2 = SingletonThree.getSingletonThree();
        System.out.println(singletonThree1 == singletonThree2);

        // 双重校验锁-单例模式 SingletonFour
        SingletonFour singletonFour1 = SingletonFour.getSingletonFour();
        SingletonFour singletonFour2 = SingletonFour.getSingletonFour();
        System.out.println(singletonFour1 == singletonFour2);

        // 枚举-单例模式 SingletonFive
        Test test3 = SingletonFive.INSTANCE.getSingletonFive();
        Test test4 = SingletonFive.INSTANCE.getSingletonFive();
        System.out.println(test3 == test4);

        // 没有使用单例
        Test test1 = new Test();
        Test test2 = new Test();
        System.out.println(test1 == test2);

    }

}
