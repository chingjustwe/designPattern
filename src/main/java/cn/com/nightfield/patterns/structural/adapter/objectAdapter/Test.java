package cn.com.nightfield.patterns.structural.adapter.objectAdapter;

/**
 * Normal person can only run, but with the adapter, people can invoke other
 * interfaces: people can even fly!
 *
 * @author: nightfield
 * @create: 2020/4/2
 **/
public class Test {
    public static void main(String[] args) {
        Person blackWidow = new Mortal("Natasha");
        blackWidow.move();
        IronSuit suit = new IronSuit();
        Person ironMan = new FlyablePersonAdapter("Tony Stark", suit);
        ironMan.move();
    }
}
