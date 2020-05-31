package cn.com.nightfield.patterns.behavioral.visitor;

/**
 * @author: nightfield
 * @create: 2020/5/31
 **/
public interface Visitable {
    int accept(Visitor visitor);
}