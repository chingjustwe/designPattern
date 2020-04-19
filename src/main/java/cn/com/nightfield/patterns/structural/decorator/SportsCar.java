package cn.com.nightfield.patterns.structural.decorator;

/**
 * a car decorator, with better equipment and higher speed
 *
 * @author: nightfield
 * @create: 2020/4/18
 **/
public class SportsCar implements Car {
    Car car;

    SportsCar(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        System.out.println("Sports Car is build with high performance engine...");
        car.drive();
    }

    @Override
    public int topSpeed() {
        return car.topSpeed() + 60;
    }
}