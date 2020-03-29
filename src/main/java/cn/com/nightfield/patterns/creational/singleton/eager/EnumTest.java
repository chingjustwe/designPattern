package cn.com.nightfield.patterns.creational.singleton.eager;

/**
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class EnumTest {
    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("EnumSingleton instance1: " + enumSingleton1.hashCode());
        System.out.println("EnumSingleton instance1: " + enumSingleton2.hashCode());
    }
}
