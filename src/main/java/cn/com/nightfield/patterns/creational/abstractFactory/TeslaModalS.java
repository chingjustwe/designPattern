package cn.com.nightfield.patterns.creational.abstractFactory;

/**
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class TeslaModalS implements Car {

    @Override
    public void getSize() {
        System.out.println("Size of American Car Modal S is '4979*1964*1445'");
    }
}