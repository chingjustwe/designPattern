package cn.com.nightfield.patterns.creational.factory;

/**
 * By passing different arguments, <code>RestaurantFactory</code> would create different restaurants.</br>
 * Extensible when adding new category, eg: for new category <b>McDonald's</b>, simply create a new factory. but it
 * introduces more factory objects than {@link TestType1}
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class TestType2 {
    public static void main(String[] args) {
        KFCFactory kfcFactory = new KFCFactory();
        PizzaHutFactory pizzaHutFactory = new PizzaHutFactory();
        Restaurant kfc = kfcFactory.createRestaurant();
        Restaurant pizzaHut = pizzaHutFactory.createRestaurant();
        kfc.getCook();
        pizzaHut.getWaiter();
    }
}

class KFCFactory {

    Restaurant createRestaurant() {
        return new KFC();
    }
}

class PizzaHutFactory {

    Restaurant createRestaurant() {
        return new PizzaHut();
    }
}
