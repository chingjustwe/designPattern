package cn.com.nightfield.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: nightfield
 * @create: 2020/4/4
 **/
public class Manager implements Employee<Engineer> {
    private String name;
    private Collection<Engineer> children = new ArrayList<>();
    Manager(String name) {
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
    public void addChild(Engineer employee) {
        children.add(employee);
    }

    @Override
    public void removeChild(Engineer employee) {
        children.remove(employee);
    }

    @Override
    public void work() {
        System.out.println("Manager " + name + " gives command to his subordinates...");
        for (Employee child : children) {
            child.work();
        }
    }
}