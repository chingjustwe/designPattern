package cn.com.nightfield.patterns.structural.adapter.objectAdapter;

/**
 * Iron man's armor is flyable
 * @author: nightfield
 * @create: 2020/3/29
 **/
public class IronSuit implements Flyable {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}