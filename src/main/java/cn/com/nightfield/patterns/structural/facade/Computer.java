package cn.com.nightfield.patterns.structural.facade;

/**
 * <code>Computer</code> is a facade of all the {@link ElectronicComponent}, it hides the complexity of
 * all the detailed logic that how {@link ElectronicComponent}s work together, and only provides a simple
 * interface which is easy to use.
 *
 * @author: nightfield
 * @create: 2020/3/29
 **/
public class Computer {
    ElectronicComponent motherboard = new Motherboard();
    ElectronicComponent cpu = new CPU();
    ElectronicComponent memory = new Memory();

    public void startup() {
        motherboard.start();
        cpu.start();
        memory.start();
        System.out.println("Computer started!");
    }

    public void shutdown() {
        motherboard.stop();
        cpu.stop();
        memory.stop();
        System.out.println("Computer has been shut down.");
    }
}
