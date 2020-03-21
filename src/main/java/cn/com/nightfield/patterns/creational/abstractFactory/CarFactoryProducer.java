package cn.com.nightfield.patterns.creational.abstractFactory;

import javax.naming.OperationNotSupportedException;

/**
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public abstract class CarFactoryProducer {
    enum FactoryType {
        JAPANESE, AMERICAN
    }

    public static CarFactory createFactory(FactoryType type) throws OperationNotSupportedException {
        switch (type) {
            case JAPANESE: return new JapaneseCarFactory();
            case AMERICAN: return new AmericanCarFactory();
        }
        throw new OperationNotSupportedException("type '" + type + "' is not supported");
    }
}