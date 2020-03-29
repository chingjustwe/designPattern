package cn.com.nightfield.patterns.creational.singleton.eager;

/**
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class StaticBlockTest {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
                System.out.println("StaticBlockSingleton in multi-thread instance: " + staticBlockSingleton.hashCode());
            }).start();
        }
    }
}
