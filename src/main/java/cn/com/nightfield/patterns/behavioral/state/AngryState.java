package cn.com.nightfield.patterns.behavioral.state;

/**
 * @author: nightfield
 * @create: 2020/5/27
 **/
public class AngryState implements State {
    @Override
    public void fight() {
        System.out.println("Fighting with power 200 on angry mode!!!");
    }
}