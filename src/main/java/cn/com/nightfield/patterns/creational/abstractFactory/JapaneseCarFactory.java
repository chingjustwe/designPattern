package cn.com.nightfield.patterns.creational.abstractFactory;

/**
 * Factory to create <b>Chinese</b>
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
class JapaneseCarFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new HondaAccord();
    }

    @Override
    public SUV getSUV() {
        return new HondaCRV();
    }
}
