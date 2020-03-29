package cn.com.nightfield.patterns.creational.singleton.lazy;

/**
 * This implementation is similar to {@link cn.com.nightfield.patterns.creational.singleton.eager.StaticFieldSingleton},
 * but the instance would only be loaded when method <code>getInstance</code> is called.<br>
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class InnerClassWrappedSingleton {

    // can only be accessed inside the class
    private InnerClassWrappedSingleton(){
        // simulate time cost when initializing the instance
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    // inner class to holder the singleton instance
    // only loaded/initialized when method getInstance is called
    // "final" modifier ensures no "partially constructed object" occurs
    private static class SingletonHolder {
        private static final InnerClassWrappedSingleton instance = new InnerClassWrappedSingleton();
    }

    public static InnerClassWrappedSingleton getInstance() {
        return SingletonHolder.instance;
    }
}