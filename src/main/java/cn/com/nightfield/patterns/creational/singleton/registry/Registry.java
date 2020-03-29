package cn.com.nightfield.patterns.creational.singleton.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <code>Registry</code> acts as a "Singleton Factory", it maintains a {@link Map} inside,
 * which contains all the singleton classes.<br>
 *
 * This type of singleton implementation do not makes classes "real singleton", we still can
 * new a instance by calling their construct method. Frameworks like <b>Spring</b> uses this
 * kind of mechanism to make beans registered to container singleton.
 *
 * @author: nightfield
 * @create: 2020/3/27
 **/
public class Registry {
    private static Map<Class, Object> registry = new ConcurrentHashMap<>();

    private Registry() {};

    public static synchronized <T> T getInstance(Class<T> type) {
        Object obj = registry.get(type);
        if (obj == null) {
            try {
                obj = type.newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
            registry.put(type, obj);
        }
        return (T) obj;
    }
}