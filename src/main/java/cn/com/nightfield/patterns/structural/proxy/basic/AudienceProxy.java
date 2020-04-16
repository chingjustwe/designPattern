package cn.com.nightfield.patterns.structural.proxy.basic;

import cn.com.nightfield.patterns.structural.proxy.Audience;
import cn.com.nightfield.patterns.structural.proxy.StatisticDao;

/**
 * a static proxy for Audience, capable to calculate the audience number without
 * changing delegator's logic
 *
 * @author: nightfield
 * @create: 2020/4/15
 **/
public class AudienceProxy implements Audience {
    // the delegated Audience
    Audience targetAudience;
    StatisticDao statisticDao = StatisticDao.newInstance();

    AudienceProxy(Audience targetAudience) {
        this.targetAudience = targetAudience;
    }

    @Override
    public void watchFilm() {
        // invoke delegated method
        targetAudience.watchFilm();
        // calculate the audience number
        statisticDao.incrAudienceNumber();
    }
}
