package cn.com.nightfield.patterns.structural.adapter.classAdapter;

/**
 * the adapter makes chinese people to speak english.
 *
 * @author: nightfield
 * @create: 2020/4/2
 **/
public class Test {
    public static void main(String[] args) {
        ChineseSpeaker xiaoming = new ChinesePeople();
        xiaoming.speak();
        ChineseSpeaker englishTeacher = new ChinesePeopleEnglishAdapter();
        englishTeacher.speak();
    }
}
