package cn.com.nightfield.patterns.creational.prototype;

/**
 * @author: nightfield
 * @create: 2020/3/24
 **/
public class ShallowPerson implements Cloneable {
    private double height;// cm
    private double weight;// kg
    private Job job;

    ShallowPerson() {}

    ShallowPerson(double height, double weight, Job job) {
        this.height = height;
        this.weight = weight;
        this.job = job;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    protected ShallowPerson clone() throws CloneNotSupportedException {
        return (ShallowPerson)super.clone();
    }
}