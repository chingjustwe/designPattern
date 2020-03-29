package cn.com.nightfield.patterns.creational.singleton.registry;

/**
 * To make an object singleton, we have to get object from {@link Registry}.
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class Test {
    public static void main(String[] args) {
        SampleClass singleton1 = Registry.getInstance(SampleClass.class);
        SampleClass singleton2 = Registry.getInstance(SampleClass.class);
        System.out.println("Registry singleton instance1: " + singleton1.hashCode());
        System.out.println("Registry singleton instance2: " + singleton2.hashCode());

        System.out.println("We can broke singleton by new a instance through class's construct method");
        SampleClass singleton3 = new SampleClass();
        System.out.println("Registry singleton instance3: " + singleton3.hashCode());
    }
}
