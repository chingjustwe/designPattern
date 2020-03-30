package cn.com.nightfield.patterns.structural.bridge;

/**
 * @author: nightfield
 * @create: 2020/3/30
 **/
public class Vim implements IDE {
    @Override
    public void run() {
        System.out.println("Vim is running...");
    }
}