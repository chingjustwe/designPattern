package cn.com.nightfield.patterns.creational.singleton.eager;

import java.io.Serializable;

/**
 * Joshua Bloch(author of 「Effective Java) suggest to use this implementation, because
 * JVM ensures enum type can only be loaded once.<br>
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {

    }
}