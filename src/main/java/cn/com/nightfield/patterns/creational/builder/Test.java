package cn.com.nightfield.patterns.creational.builder;

/**
 * By using a <b>Builder</b>, we hide the construct detail of class <code>Pizza</code>, and
 * makes it easier to create a complex object, with a more readable way.</br>
 * This is extremely useful when a class has a lot of construct arguments, or there are
 * lots of combinations of them.
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class Test {
    public static void main(String[] args) {
        Pizza.Builder pizzaBuilder = new Pizza.Builder();
        Pizza pizza = pizzaBuilder.size(6)
                .crustType(Pizza.CrustType.THIN)
                .topping("Durian")
                .build();

        pizza.info();
    }
}
