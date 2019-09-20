package bilibili.thread_pool;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Classname SubThread
 * @Date 2019/7/25 10:46
 * @Created by jianjieming
 */
public class SubThread extends Thread {
    // 任务队列
    public static final LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    private boolean flag = true;

    @Override
    public void run() {
        try {
            while (flag) {
                Runnable take = queue.take();
                take.run();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void addTask(Runnable runnable) {
        queue.add(runnable);
    }

    public static void addTaskList(List<Runnable> runnables) {
        queue.addAll(runnables);
    }

    public void close() {
        flag = false;
    }

}
