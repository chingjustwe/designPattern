package cn.com.nightfield.patterns.structural.adapter.classAdapter;

/**
 * @author: nightfield
 * @create: 2020/4/2
 **/
public class EnglishPeople implements EnglishSpeaker {
    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}