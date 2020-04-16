package cn.com.nightfield.patterns.structural.proxy;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Simulate a <b>Dao</b> to cache how many people watched a film</br>
 * make it as singleton
 *
 * @author: nightfield
 * @create: 2020/4/15
 **/
public class StatisticDao {
    private static StatisticDao instance = new StatisticDao();
    AtomicLong audienceNumber = new AtomicLong();
    private StatisticDao(){};

    public void incrAudienceNumber() {
        audienceNumber.getAndIncrement();
    }

    public void showAudienceNumber() {
        System.out.println(audienceNumber.get() + " audiences have watched the film.");
    }

    public static StatisticDao newInstance() {
        return instance;
    }
}
