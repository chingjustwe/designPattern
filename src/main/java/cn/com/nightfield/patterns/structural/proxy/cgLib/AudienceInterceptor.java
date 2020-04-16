package cn.com.nightfield.patterns.structural.proxy.cgLib;

import cn.com.nightfield.patterns.structural.proxy.Audience;
import cn.com.nightfield.patterns.structural.proxy.StatisticDao;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.apache.tools.ant.util.ReflectUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * dynamic proxy for Audience supported by <b>CGLib</b> <code>MethodInterceptor</code>, capable to calculate
 * the audience number without changing delegator's logic
 *
 * @author: nightfield
 * @create: 2020/4/15
 **/
public class AudienceInterceptor implements MethodInterceptor {
    // the delegated Audience
    Audience targetAudience;
    StatisticDao statisticDao = StatisticDao.newInstance();

    AudienceInterceptor(Audience targetAudience) {
        this.targetAudience = targetAudience;
    }

    public Audience getProxy() {
        // actually, below step creates a proxy class/instance using CGLib dynamically, the proxy is a sub-class
        // of the delegator, so we can only use it when the delegator can be extended(not a final class)
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetAudience.getClass());
        enhancer.setCallback(this);
        return (Audience) enhancer.create(new Class[]{String.class}, new Object[]{ReflectUtil.getField(targetAudience, "name")});
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        // invoke delegated method
        Object ret = proxy.invokeSuper(obj, args);
        // calculate the audience number
        statisticDao.incrAudienceNumber();
        return ret;
    }
}