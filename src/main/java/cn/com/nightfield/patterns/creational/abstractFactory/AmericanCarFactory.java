package cn.com.nightfield.patterns.creational.abstractFactory;

/**
 * @author: nightfield
 * @create: 2020/3/19
 **/
class AmericanCarFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new TeslaModalS();
    }

    @Override
    public SUV getSUV() {
        return new TeslaModalX();
    }
}
