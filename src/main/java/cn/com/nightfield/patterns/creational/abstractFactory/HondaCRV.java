package cn.com.nightfield.patterns.creational.abstractFactory;

/**
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class HondaCRV implements SUV {

    @Override
    public void getSize() {
        System.out.println("Size of Japanese SUV C-RV is '4585*1855*1689'");
    }
}