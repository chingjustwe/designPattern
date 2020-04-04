package cn.com.nightfield.patterns.structural.adapter.classAdapter;

/**
 * adapter two incompatible interfaces.
 * the relationship here is "is-a", so the adapter extends EnglishPeople;
 *
 * @author: nightfield
 * @create: 2020/4/2
 **/
public class ChinesePeopleEnglishAdapter extends EnglishPeople implements ChineseSpeaker {
    @Override
    public void speak() {
        this.talk();
    }
}