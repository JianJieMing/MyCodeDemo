package two;

import java.io.Serializable;

/**
 * @Classname two.Main28
 * @Date 2019/7/19 14:53
 * @Created by jianjieming
 */
public class Main28 implements Serializable {

    private volatile static Main28 INSTANCE;

    private Main28() {
    }

    public static Main28 getSingleton() {
        if (INSTANCE == null) {
            synchronized (Main28.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Main28();
                }
            }
        }
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
