package cn.com.nightfield.patterns.structural.adapter.defaultAdapter;

/**
 * the adapter provides empty/default implementation of interface method, so
 * the subclass of the adapter only need to override the methods that they really
 * care.
 *
 * @author: nightfield
 * @create: 2020/4/2
 **/
public class PeopleAdapter implements People {
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public void speak() {

    }
}