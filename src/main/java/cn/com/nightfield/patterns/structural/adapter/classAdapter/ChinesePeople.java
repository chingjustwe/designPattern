package cn.com.nightfield.patterns.structural.adapter.classAdapter;

/**
 * @author: nightfield
 * @create: 2020/4/2
 **/
public class ChinesePeople implements ChineseSpeaker {
    @Override
    public void speak() {
        System.out.println("大家好");
    }
}