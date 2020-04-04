package cn.com.nightfield.patterns.structural.adapter.defaultAdapter;

/**
 * {@link Athlete} only cares about the method <code>move</code>, so it only need
 * to override <code>move</code>.
 *
 * @author: nightfield
 * @create: 2020/4/2
 **/
public class Athlete extends PeopleAdapter {
    @Override
    public void move() {
        System.out.println("Athlete is running.");
    }
}