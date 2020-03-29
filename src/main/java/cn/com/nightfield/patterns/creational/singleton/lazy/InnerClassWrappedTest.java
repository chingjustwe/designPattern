package cn.com.nightfield.patterns.creational.singleton.lazy;

/**
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class InnerClassWrappedTest {
    public static void main(String[] args) {
        // InnerClassWrappedSingleton multi-thread test
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                InnerClassWrappedSingleton innerClassWrappedSingleton = InnerClassWrappedSingleton.getInstance();
                System.out.println("InnerClassWrappedSingleton in multi-thread instance: " + innerClassWrappedSingleton.hashCode());
            }).start();
        }
    }
}
