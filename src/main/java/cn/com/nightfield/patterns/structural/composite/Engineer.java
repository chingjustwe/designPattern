package cn.com.nightfield.patterns.structural.composite;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: nightfield
 * @create: 2020/4/4
 **/
public class Engineer implements Employee {
    private String name;
    Engineer(String name) {
        this.name = name;
    };

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Collection getChildren() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("No child under engineer.");
    }

    @Override
    public void addChild(Employee employee) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Can not add child for engineer.");
    }

    @Override
    public void removeChild(Employee employee) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Can not remove child for engineer.");
    }

    @Override
    public void work() {
        System.out.println("Engineer " + name + " is coding...");
    }
}