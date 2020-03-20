package cn.com.nightfield.patterns.creational.abstractFactory;

/**
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class HondaAccord implements Car {

    @Override
    public void getSize() {
        System.out.println("Size of Japanese Car Accord is '4893*1862*1449'");
    }
}