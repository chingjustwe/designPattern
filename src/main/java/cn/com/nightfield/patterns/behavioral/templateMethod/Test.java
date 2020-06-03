package cn.com.nightfield.patterns.behavioral.templateMethod;

/**
 * template method pattern defines the skeleton of an algorithm in the superclass,
 * and lets subclasses override specific steps of the algorithm without changing its
 * structure, it helped code reuse.
 * @author: nightfield
 * @create: 2020/5/29
 **/
public class Test {
    public static void main(String[] args) {
        PizzaCook fruitPizzaCook = new FruitPizzaCook();
        fruitPizzaCook.bakePizza();
        System.out.println("--------------");
        PizzaCook baconPizzaCook = new BaconPizzaCook();
        baconPizzaCook.bakePizza();
    }
}
