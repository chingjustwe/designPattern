package cn.com.nightfield.patterns.behavioral.strategy;

/**
 * @author: nightfield
 * @create: 2020/5/24
 **/
public class BikeStrategy implements TransportationStrategy {
    private String bike;

    BikeStrategy(String bike) {
        this.bike = bike;
    };

    @Override
    public void execute() {
        System.out.println("Riding the '" + bike + "'bike...");
    }
}