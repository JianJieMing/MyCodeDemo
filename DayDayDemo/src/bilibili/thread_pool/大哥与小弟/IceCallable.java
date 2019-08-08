package bilibili.thread_pool.大哥与小弟;

import java.util.concurrent.Callable;

/**
 * @Classname IceCallable
 * @Date 2019/7/26 11:26
 * @Created by jianjieming
 */
public class IceCallable implements Callable<Integer> {

    private int money;

    public IceCallable(int money) {
        this.money = money;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("小弟开始去买雪糕");
        Thread.sleep(1000);
        System.out.println("小弟买完雪糕");
        return money - 2;
    }
}
