package cn.com.nightfield.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: nightfield
 * @create: 2020/4/4
 **/
public class Director implements Employee<Manager> {
    private String name;
    private Collection<Manager> children = new ArrayList<>();
    Director(String name) {
        this.name = name;
    };

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Collection getChildren() {
        return children;
    }

    @Override
    public void addChild(Manager employee) {
        children.add(employee);
    }

    @Override
    public void removeChild(Manager employee) {
        children.remove(employee);
    }

    @Override
    public void work() {
        System.out.println("Director " + name + " gives command to his subordinate...");
        for (Employee child : children) {
            child.work();
        }
    }
}