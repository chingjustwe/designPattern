package cn.com.nightfield.patterns.structural.bridge;

/**
 * @author: nightfield
 * @create: 2020/3/30
 **/
public abstract class Developer {
    // holds an IDE instance
    protected IDE ide;

    // force construct with an IDE instance
    Developer(IDE ide) {
        this.ide = ide;
    }

    abstract void coding();
}