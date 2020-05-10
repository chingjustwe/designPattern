package cn.com.nightfield.patterns.structural.flyweight;

/**
 * <b>String Pool</b> is the best example of fly weight pattern. String objects with the same content
 * share the same instance.</br>
 * Method <code>valueOf</code> of Wrapper classes also the example of fly weight pattern.
 *
 * @author: nightfield
 * @create: 2020/4/25
 **/
public class Test {
    public static void main(String[] args) {
        String a = "123";
        String b = "123";
        // stored in String pool
        System.out.println("is String instance equal: " + (a == b));

        // [-128, 127] are cached on memory
        Integer i1 = Integer.valueOf(127);
        Integer i2 = Integer.valueOf(127);
        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);
        System.out.println("is instance 127 equal: " + (i1 == i2));
        System.out.println("is instance 128 equal: " + (i3 == i4));
    }
}
