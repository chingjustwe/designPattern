package cn.com.nightfield.patterns.creational.singleton.lazy;

/**
 * With <b>synchronized</b> protection, this implementation can handle multi-thread cases.
 * but the performance is not good enough, because actually we only need the synchronization
 * when the instance is initializing, we do not need it afterwards.
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class SynchronizedSingleton {
    private static SynchronizedSingleton singletonInstance;

    // can only be accessed inside the class
    private SynchronizedSingleton(){
        // simulate time cost when initializing the instance
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    // add synchronized here, to handle multi-thread cases.
    public static synchronized SynchronizedSingleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SynchronizedSingleton();
        }
        return singletonInstance;
    }
}