package cn.com.nightfield.patterns.structural.decorator;

/**
 * {@link SportsCar} is a decorator of {@link BasicCar}, all methods are enhanced without change
 * the logic of {@link BasicCar}.
 *
 * @author: nightfield
 * @create: 2020/4/18
 **/
public class Test {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car sportsCar = new SportsCar(basicCar);
        basicCar.drive();
        System.out.println("top speed of basic car: " + basicCar.topSpeed());
        System.out.println("=============");
        sportsCar.drive();
        System.out.println("top speed of sports car: " + sportsCar.topSpeed());
    }
}
