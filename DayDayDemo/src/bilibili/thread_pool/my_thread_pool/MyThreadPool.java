package bilibili.thread_pool.my_thread_pool;

import bilibili.thread_pool.SubThread;

import java.util.List;

/**
 * @Classname MyThreadPool
 * @Date 2019/7/25 11:47
 * @Created by jianjieming
 */
public class MyThreadPool {

    private SubThread[] subThreads;

    /**
     * 线程池初始化
     *
     * @param poolSize
     */
    public MyThreadPool(int poolSize) {
        subThreads = new SubThread[poolSize];
        for (int i = 0; i < subThreads.length; i++) {
            subThreads[i] = new SubThread();
        }
    }

    /**
     * 开启线程池
     */
    public void start() {
        for (SubThread thread : subThreads) {
            thread.start();
        }
    }

    public void execute(Runnable runnable) {
        SubThread.addTask(runnable);
    }

    public void executeList(List<Runnable> runnables) {
        SubThread.addTaskList(runnables);
    }

}
