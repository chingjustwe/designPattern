package cn.com.nightfield.patterns.creational.factory;

/**
 * sub-class，implementation of Restaurant.
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class KFC implements Restaurant {

    @Override
    public void getCook() {
        System.out.println("I'm KFC cook.");
    }

    @Override
    public void getWaiter() {
        System.out.println("I'm KFC waiter.");
    }
}