package cn.com.nightfield.patterns.creational.singleton.singletonDestroyAndProtect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <b>Java Reflect</b> can destroy almost all the singleton implementation, except the <b>Enum Implementation</b>,
 * because reflect allows to access private construct method.
 *
 * @author: zhochi
 * @create: 2020/3/28
 **/
public class SingletonDestroyerRefelct {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        InnerClassWrappedSingleton instance1 = InnerClassWrappedSingleton.getInstance();
        System.out.println("singleton instance1: " + instance1.hashCode());

        Constructor[] constructors = InnerClassWrappedSingleton.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            // using reflect to create an instance
            constructor.setAccessible(true);
            InnerClassWrappedSingleton instance2 = (InnerClassWrappedSingleton) constructor.newInstance();
            System.out.println("singleton instance2: " + instance2.hashCode());
            break;
        }
    }

    public static class InnerClassWrappedSingleton {

        private InnerClassWrappedSingleton(){
        };
        private static class SingletonHolder {
            private static final InnerClassWrappedSingleton instance = new InnerClassWrappedSingleton();
        }
        public static InnerClassWrappedSingleton getInstance() {
            return SingletonHolder.instance;
        }
    }
}
