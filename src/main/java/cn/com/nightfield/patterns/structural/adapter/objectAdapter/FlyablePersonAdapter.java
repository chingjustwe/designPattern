package cn.com.nightfield.patterns.structural.adapter.objectAdapter;

/**
 * adapter two incompatible interfaces.
 * the relationship of the person and suit is "has-a", so the adapter
 * holds an IronSuit instance.
 *
 * @author: nightfield
 * @create: 2020/3/29
 **/
public class FlyablePersonAdapter implements Person {
    private String name;
    IronSuit suit;
    FlyablePersonAdapter(String name, IronSuit suit) {
        this.name = name;
        this.suit = suit;
    }
    @Override
    public void move() {
        System.out.print(name + " is wearing Iron Suit: ");
        suit.fly();
    }
}