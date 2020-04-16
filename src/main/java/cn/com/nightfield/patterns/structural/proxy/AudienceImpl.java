package cn.com.nightfield.patterns.structural.proxy;

/**
 * @author: nightfield
 * @create: 2020/4/15
 **/
public class AudienceImpl implements Audience {
    String name;
    public AudienceImpl(String name) {
        this.name = name;
    }

    @Override
    public void watchFilm() {
        System.out.println(name + " is watching film.");
    }

}
