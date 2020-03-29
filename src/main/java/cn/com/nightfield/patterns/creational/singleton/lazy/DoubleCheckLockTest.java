package cn.com.nightfield.patterns.creational.singleton.lazy;

/**
 * DoubleCheckLockSingleton is more lightweight than {@link SynchronizedSingleton}, because
 * it doesn't need to acquired the lock after instance created.
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class DoubleCheckLockTest {
    public static void main(String[] args) {
        // DoubleCheckLockSingleton multi-thread test
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                DoubleCheckLockSingleton doubleCheckLockSingleton = DoubleCheckLockSingleton.getInstance();
                System.out.println("DoubleCheckLockSingleton in multi-thread instance: " + doubleCheckLockSingleton.hashCode());
            }).start();
        }
    }
}
