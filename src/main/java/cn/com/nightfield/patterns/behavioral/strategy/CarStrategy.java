package cn.com.nightfield.patterns.behavioral.strategy;

/**
 * @author: nightfield
 * @create: 2020/5/24
 **/
public class CarStrategy implements TransportationStrategy {
    private String car;

    CarStrategy(String car) {
        this.car = car;
    };

    @Override
    public void execute() {
        System.out.println("Driving the '" + car + "'car...");
    }
}