package cn.com.nightfield.patterns.creational.singleton.lazy;

/**
 * <code>SynchronizedSingleton</code> works in multi-thread cases, only with low efficiency.
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class SynchronizedTest {
    public static void main(String[] args) {
        // SynchronizedSingleton multi-thread test
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
                System.out.println("SynchronizedSingleton in multi-thread instance: " + synchronizedSingleton.hashCode());
            }).start();
        }
    }
}
