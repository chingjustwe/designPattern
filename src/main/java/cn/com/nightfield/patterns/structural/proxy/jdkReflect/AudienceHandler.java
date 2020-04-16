package cn.com.nightfield.patterns.structural.proxy.jdkReflect;

import cn.com.nightfield.patterns.structural.proxy.Audience;
import cn.com.nightfield.patterns.structural.proxy.StatisticDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * dynamic proxy for Audience supported by <b>JDK</b> <code>InvocationHandler</code>, capable to calculate
 * the audience number without changing delegator's logic
 *
 * @author: nightfield
 * @create: 2020/4/15
 **/
public class AudienceHandler implements InvocationHandler {
    // the delegated Audience
    Audience targetAudience;
    StatisticDao statisticDao = StatisticDao.newInstance();

    AudienceHandler(Audience targetAudience) {
        this.targetAudience = targetAudience;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // invoke delegated method
        Object obj = method.invoke(targetAudience, args);
        // calculate the audience number
        statisticDao.incrAudienceNumber();
        return obj;
    }

    public Audience getProxy() {
        // actually, method newProxyInstance will create a proxy class/instance dynamically, and the delegator's
        // interface is a mandatory parameter to get the proxy, so we can only use it when the delegator implemented
        // an interface
        return (Audience) Proxy.newProxyInstance(targetAudience.getClass().getClassLoader(), targetAudience.getClass().getInterfaces(), this);
    }
}
