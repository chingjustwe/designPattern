package cn.com.nightfield.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * public account that publishes articles
 * @author: nightfield
 * @create: 2020/5/10
 **/
public class PublicAccount implements Observable<Article> {
    private String name;
    private Collection<Observer> subscribers;
    private Collection<Article> articles;
    PublicAccount(String name) {
        this.name = name;
        subscribers = new ArrayList<>();
        articles = new LinkedList<>();
    };

    @Override
    public synchronized void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public synchronized void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public synchronized void publish(Article article) {
        articles.add(article);
        System.out.println(name + " is publishing new article...");
        for (Observer subscriber : subscribers) {
            subscriber.update(article);
        }
    }

}