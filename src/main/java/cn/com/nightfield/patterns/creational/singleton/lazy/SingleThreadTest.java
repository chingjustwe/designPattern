package cn.com.nightfield.patterns.creational.singleton.lazy;

import java.util.concurrent.CountDownLatch;

/**
 * in single-thread cases, we can get the singleton instance normally, but as for multi-thread
 * cases, we can get different "singleton instance", which is not we want.
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class SingleThreadTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        // SingleThreadSingleton multi-thread test
        for (int i = 0; i < 2; i++) {
            final int finalI = i;
            new Thread(() -> {
                SingleThreadSingleton singleThreadSingleton = SingleThreadSingleton.getInstance(String.valueOf(finalI));
                System.out.println("SingleThreadSingleton in multi-thread instance: " + singleThreadSingleton.hashCode());
                latch.countDown();
            }).start();
        }

        latch.await();
        // SingleThreadSingleton single-thread test
        SingleThreadSingleton singleThreadSingleton1 = SingleThreadSingleton.getInstance("1");
        SingleThreadSingleton singleThreadSingleton2 = SingleThreadSingleton.getInstance("2");
        System.out.println("SingleThreadSingleton in single-thread instance: " + singleThreadSingleton1.hashCode());
        System.out.println("SingleThreadSingleton in single-thread instance: " + singleThreadSingleton2.hashCode());

    }
}
