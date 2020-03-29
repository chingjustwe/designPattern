package cn.com.nightfield.patterns.creational.singleton.eager;

/**
 * eager initialization the singleton instance as soon as the <code>StaticField</code> class
 * being loaded to JVM, even we don't want to use it.</br>
 *
 * If the singleton class is not using a lot of resources, this is the approach to use. But
 * in most of the scenarios, Singleton classes are created for resources such as File System,
 * Database connections, etc. We should avoid the instantiation until unless client calls the
 * getInstance method. </br>
 * Also, this type not support exception handling.
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class StaticFieldSingleton {
    private static StaticFieldSingleton singletonInstance = new StaticFieldSingleton();

    // can only be accessed inside the class
    private StaticFieldSingleton(){};

    // the only method exposed to outside, can only get the same instance
    public static StaticFieldSingleton getInstance() {
        return singletonInstance;
    }
}