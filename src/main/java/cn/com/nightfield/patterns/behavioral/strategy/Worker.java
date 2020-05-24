package cn.com.nightfield.patterns.behavioral.strategy;

/**
 * the way to go to work, is decide by TransportationStrategy
 * @author: nightfield
 * @create: 2020/5/24
 **/
public class Worker {
    private String name;

    Worker(String name) {
        this.name = name;
    };

    public void goToWork(TransportationStrategy strategy) {
        strategy.execute();
        System.out.println(name + " is on the way to office.");
    }
}