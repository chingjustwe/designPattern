package cn.com.nightfield.patterns.behavioral.observer;

/**
 * @author: nightfield
 * @create: 2020/5/10
 **/
public interface Observable<T> {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void publish(T object);
}