package cn.com.nightfield.patterns.behavioral.strategy;

/**
 * @author: nightfield
 * @create: 2020/5/24
 **/
public class BusStrategy implements TransportationStrategy {
    private String trafficCard;

    BusStrategy(String trafficCard) {
        this.trafficCard = trafficCard;
    };

    @Override
    public void execute() {
        System.out.println("Taking the bus with traffic card '" + trafficCard + "'...");
    }
}