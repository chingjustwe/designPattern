package cn.com.nightfield.patterns.structural.adapter.objectAdapter;

/**
 * @author: nightfield
 * @create: 2020/3/29
 **/
public class Mortal implements Person {
    private String name;
    Mortal(String name) {
        this.name = name;
    }
    @Override
    public void move() {
        System.out.println(name + " is running!");
    }
}