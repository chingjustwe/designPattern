package cn.com.nightfield.patterns.creational.abstractFactory;

import java.util.Calendar;

/**
 * The biggest difference between <b>Factory Method Pattern</b> and <b>Abstract Factory</b> is, <b>Abstract Factory</b> is more focused
 * on created a branch of objects that belongs to a same family.</br>
 *
 * Factory <code>ChineseRestaurantFactory</code> can create all chinese related objects: <code>ChineseCook</code>, <code>ChineseWaiter</code>
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class Test {

    public static void main(String[] args) {
        CarFactory japaneseCarFactory = new JapaneseCarFactory();
        Car japaneseCar = japaneseCarFactory.getCar();
        japaneseCar.getSize();
        SUV japaneseSUV = japaneseCarFactory.getSUV();
        japaneseSUV.getSize();

        CarFactory americanCarFactory = new AmericanCarFactory();
        Car americanCar = americanCarFactory.getCar();
        americanCar.getSize();
        SUV americanSUV = americanCarFactory.getSUV();
        americanSUV.getSize();
    }
}
