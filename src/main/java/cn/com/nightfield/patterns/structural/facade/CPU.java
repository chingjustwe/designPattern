package cn.com.nightfield.patterns.structural.facade;

/**
 * @author: nightfield
 * @create: 2020/3/29
 **/
public class CPU implements ElectronicComponent {
    @Override
    public void start() {
        System.out.println("CPU is starting up...");
    }

    @Override
    public void stop() {
        System.out.println("CPU is shutting down...");
    }
}