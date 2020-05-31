package cn.com.nightfield.patterns.behavioral.templateMethod;

/**
 * @author: nightfield
 * @create: 2020/5/30
 **/
public class BaconPizzaCook extends PizzaCook {

    @Override
    protected void processTopping() {
        System.out.println("Putting the bacon on the Pizza...");
    }
}