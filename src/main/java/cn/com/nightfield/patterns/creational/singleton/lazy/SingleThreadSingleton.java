package cn.com.nightfield.patterns.creational.singleton.lazy;

/**
 * This is the simplest way to implement a lazy initialized singleton, but it can only be
 * used in single thread scenario.
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class SingleThreadSingleton {
    private String value;
    private static SingleThreadSingleton singletonInstance;

    // can only be accessed inside the class
    private SingleThreadSingleton(String value){
        // simulate time cost when initializing the instance
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    };

    // no lock here, can not handle multi-thread cases.
    public static SingleThreadSingleton getInstance(String value) {
        if (singletonInstance == null) {
            singletonInstance = new SingleThreadSingleton(value);
        }
        return singletonInstance;
    }

    @Override
    public String toString() {
        return "SingleThreadSingleton{" +
                "value='" + value + '\'' +
                '}';
    }
}