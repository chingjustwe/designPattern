package cn.com.nightfield.patterns.creational.singleton.eager;

/**
 * This single type is just the same as {@link StaticFieldSingleton}, except it provides
 * exception handling.
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class StaticBlockSingleton {
    private static StaticBlockSingleton singletonInstance;

    // can only be accessed inside the class
    private StaticBlockSingleton(){};

    // static is called as soon as the class being loaded
    static {
        try {
            singletonInstance = new StaticBlockSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // the only method exposed to outside, can only get the same instance
    public static StaticBlockSingleton getInstance() {
        return singletonInstance;
    }
}