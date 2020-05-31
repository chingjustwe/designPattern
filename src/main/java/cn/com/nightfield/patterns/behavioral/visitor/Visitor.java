package cn.com.nightfield.patterns.behavioral.visitor;

/**
 * @author: nightfield
 * @create: 2020/5/31
 **/
public interface Visitor {
    int getTotalCost(Fruit... fruits);
    int visit(Apple apple);
    int visit(Orange orange);
    int visit(Banana banana);
}