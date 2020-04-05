package cn.com.nightfield.patterns.structural.composite;

import javax.naming.OperationNotSupportedException;
import java.util.Collection;

/**
 * Common interface that all employees would have
 *
 * @author: nightfield
 * @create: 2020/4/4
 **/
public interface Employee<T extends Employee> {
    String getName();
    Collection<T> getChildren() throws OperationNotSupportedException;
    void addChild(T employee) throws OperationNotSupportedException;
    void removeChild(T employee) throws OperationNotSupportedException;
    void work();
}