package cn.com.nightfield.patterns.creational.abstractFactory;

/**
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class TeslaModalX implements SUV {

    @Override
    public void getSize() {
        System.out.println("Size of American SUV Modal X is '5037*2070*1684'");
    }
}