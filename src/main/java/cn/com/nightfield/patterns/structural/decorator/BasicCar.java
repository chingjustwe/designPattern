package cn.com.nightfield.patterns.structural.decorator;

/**
 * @author: nightfield
 * @create: 2020/4/18
 **/
public class BasicCar implements Car {

    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }

    @Override
    public int topSpeed() {
        return 120;
    }
}