package cn.com.nightfield.patterns.behavioral.visitor;

/**
 * @author: nightfield
 * @create: 2020/5/31
 **/
public class Banana implements Fruit {
    private int pricePerKg;
    private int weight;
    public Banana(int pricePerKg, int weight) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    @Override
    public int getPricePerKg() {
        return pricePerKg;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}