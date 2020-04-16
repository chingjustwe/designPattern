package cn.com.nightfield.patterns.structural.proxy.jdkReflect;

import cn.com.nightfield.patterns.structural.proxy.Audience;
import cn.com.nightfield.patterns.structural.proxy.AudienceImpl;
import cn.com.nightfield.patterns.structural.proxy.StatisticDao;

/**
 * use the proxy instance instead of real instance, we can do more things other than the
 * delegated logic. in this case, we can calculate the audience number.
 *
 * @author: nightfield
 * @create: 2020/3/29
 **/
public class Test {
    public static void main(String[] args) {
        Audience nightField = new AudienceHandler(new AudienceImpl("Night Field")).getProxy();
        Audience rocky = new AudienceHandler(new AudienceImpl("Rocky")).getProxy();
        nightField.watchFilm();
        rocky.watchFilm();

        StatisticDao.newInstance().showAudienceNumber();
    }
}
