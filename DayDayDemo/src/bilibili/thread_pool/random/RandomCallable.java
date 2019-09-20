package bilibili.thread_pool.random;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @Classname RandomCallable
 * @Date 2019/7/26 12:05
 * @Created by jianjieming
 */
public class RandomCallable implements Callable<Integer> {
    private ThreadLocal<Random> local = ThreadLocal.withInitial(Random::new);
    @Override
    public Integer call() throws Exception {
//        Random random = new Random();
//        Random random = local.get();
//        if (random == null) {
//            local.set(new Random());
//        }
        long timeMillis = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            local.get().nextInt();
        }
        long result = System.currentTimeMillis() - timeMillis;
        return Integer.parseInt(String.valueOf(result));
    }
}
