package cn.com.nightfield.patterns.creational.singleton.lazy;

/**
 * Compare to {@link SynchronizedSingleton}, double check lock makes it possible to not
 * using lock after singleton instance is created.<br>
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class DoubleCheckLockSingleton {
    // field should be volatile, to avoid "partially constructed object"
    private static volatile DoubleCheckLockSingleton singletonInstance;

    // can only be accessed inside the class
    private DoubleCheckLockSingleton(){
        // simulate time cost when initializing the instance
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    // add double check lock here
    // add local variable "instance" to decrease volatile read count
    public static DoubleCheckLockSingleton getInstance() {
        DoubleCheckLockSingleton instance = singletonInstance;
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                instance = singletonInstance;
                if (instance == null) {
                    instance = singletonInstance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}