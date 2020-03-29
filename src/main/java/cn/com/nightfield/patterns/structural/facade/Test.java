package cn.com.nightfield.patterns.structural.facade;

/**
 * The {@link Computer} facade make it much easier for client to use, client do not need to
 * know the underlying logic.
 *
 * @author: nightfield
 * @create: 2020/3/29
 **/
public class Test {
    public static void main(String[] args) {
        Computer facade = new Computer();
        // use computer facade to start up
        facade.startup();
        // use computer facade to shut down
        facade.shutdown();
    }
}
