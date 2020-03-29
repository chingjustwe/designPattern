package cn.com.nightfield.patterns.structural.facade;

/**
 * @author: nightfield
 * @create: 2020/3/29
 **/
public class Memory implements ElectronicComponent {
    @Override
    public void start() {
        System.out.println("Memory is starting up...");
    }

    @Override
    public void stop() {
        System.out.println("Memory is shutting down...");
    }
}