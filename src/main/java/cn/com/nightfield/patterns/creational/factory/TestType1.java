package cn.com.nightfield.patterns.creational.factory;

/**
 * By passing different arguments, <code>RestaurantFactory</code> would create different restaurants.</br>
 * Less extensible than {@link TestType2}, every time we got a new Restaurant, we have to change the original code, this violates the <b>Open Closed Principle</b>.</br>
 *
 * When we know that the categories would never be changed, we can use this type of pattern.
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class TestType1 {
    public static void main(String[] args) {
        RestaurantFactory factory = new RestaurantFactory();
        Restaurant kfc = factory.createRestaurant(RestaurantFactory.RestaurantType.KFC);
        Restaurant pizzaHut = factory.createRestaurant(RestaurantFactory.RestaurantType.PizzaHut);
        kfc.getCook();
        pizzaHut.getWaiter();
    }
}

class RestaurantFactory {
    enum RestaurantType {
        KFC, PizzaHut
    }

    Restaurant createRestaurant(RestaurantType type) {
        switch (type) {
            case KFC: return new KFC();
            case PizzaHut: return new PizzaHut();
            default: System.out.format("Invalid restaurant %s", type); return null;
        }
    }
}
