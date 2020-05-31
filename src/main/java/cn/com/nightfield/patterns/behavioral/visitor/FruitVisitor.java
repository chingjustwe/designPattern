package cn.com.nightfield.patterns.behavioral.visitor;

/**
 * the algorithm is owned by visitor, instead of inside the Fruit. logic of operation changes,
 * then we need to make change only in the visitor rather than doing it in all the Fruit classes.
 * @author: nightfield
 * @create: 2020/5/31
 **/
public class FruitVisitor implements Visitor {

    @Override
    public int getTotalCost(Fruit... fruits) {
        int cost = 0;
        for (Fruit fruit : fruits) {
            cost += fruit.accept(this);
        }
        return cost;
    }

    @Override
    public int visit(Apple apple) {
        // simulate apple is 20% off
        int pricePerKg = apple.getPricePerKg();
        if (pricePerKg > 10) {
            pricePerKg *= 0.8;
        }
        int cost = pricePerKg * apple.getWeight();
        System.out.println(apple.getWeight() + "kg apples costs $" + cost);
        return cost;
    }

    @Override
    public int visit(Orange orange) {
        // simulate apple is on discount
        int pricePerKg = orange.getPricePerKg();
        if (orange.getWeight() > 2) {
            pricePerKg -= pricePerKg - 2;
        }
        int cost = pricePerKg * orange.getWeight();
        System.out.println(orange.getWeight() + "kg oranges costs $" + cost);
        return cost;
    }

    @Override
    public int visit(Banana banana) {
        // no discount on banana
        int cost = banana.getPricePerKg() * banana.getWeight();
        System.out.println(banana.getWeight() + "kg bananas costs $" + cost);
        return cost;
    }
}