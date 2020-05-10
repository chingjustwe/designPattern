package cn.com.nightfield.patterns.behavioral.observer;

/**
 * @author: nightfield
 * @create: 2020/5/10
 **/
public interface Observer<T> {
    void update(T object);
}