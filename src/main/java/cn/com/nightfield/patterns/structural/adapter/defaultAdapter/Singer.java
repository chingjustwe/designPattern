package cn.com.nightfield.patterns.structural.adapter.defaultAdapter;

/**
 * {@link Singer} only cares about the method <code>speak</code>, so it only need
 * to override <code>speak</code>.
 *
 * @author: nightfield
 * @create: 2020/4/2
 **/
public class Singer extends PeopleAdapter {
    @Override
    public void speak() {
        System.out.println("Singer is singing.");
    }
}