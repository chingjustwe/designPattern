package cn.com.nightfield.patterns.creational.singleton.eager;

/**
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class StaticFieldTest {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                StaticFieldSingleton staticFieldSingleton = StaticFieldSingleton.getInstance();
                System.out.println("StaticFieldSingleton in multi-thread instance: " + staticFieldSingleton.hashCode());
            }).start();
        }
    }
}
