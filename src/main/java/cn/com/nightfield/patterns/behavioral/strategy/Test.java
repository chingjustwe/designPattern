package cn.com.nightfield.patterns.behavioral.strategy;

/**
 * people can choose different {@link TransportationStrategy} to go working, and also they
 * can easily change it simply by change the concreted/implement class. 
 * @author: nightfield
 * @create: 2020/5/24
 **/
public class Test {
    public static void main(String[] args) {
        TransportationStrategy BusStrategy = new BusStrategy("NO.9382-2345");
        Worker link = new Worker("Link");
        link.goToWork(BusStrategy);

        TransportationStrategy bikeStrategy = new BikeStrategy("Giant");
        Worker mario = new Worker("Mario");
        mario.goToWork(bikeStrategy);

        TransportationStrategy carStrategy = new BusStrategy("Tesla");
        Worker yoshi = new Worker("Yoshi");
        yoshi.goToWork(carStrategy);
    }
}
