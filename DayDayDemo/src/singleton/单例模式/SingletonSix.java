package singleton.单例模式;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Classname SingletonSix
 * @Date 2019/9/24 10:41
 * @Created by jianjieming
 */
public class SingletonSix implements Serializable {

    private static final AtomicReference<SingletonSix> INSTANCE = new AtomicReference<>();

    public static SingletonSix getInstance() {
        for (; ; ) {
            SingletonSix current = INSTANCE.get();
            if (current != null) {
                return current;
            }
            current = new SingletonSix();
            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }

    private SingletonSix() {
        IllegalStateException illegalStateException = new IllegalStateException("不能调用构造方法,请使用getInstance()来获取实例");

        StackTraceElement[] stackElements = illegalStateException.getStackTrace();

        if (stackElements != null && !stackElements[1].getClassName().equals(getClass().getName())) {
            throw illegalStateException;
        }
    }

    // 用于反序列化
    private Object readResolve(){
        return getInstance();
    }
}
