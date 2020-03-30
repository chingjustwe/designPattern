package cn.com.nightfield.patterns.structural.bridge;

/**
 * @author: nightfield
 * @create: 2020/3/30
 **/
public class JavaDeveloper extends Developer {

    JavaDeveloper(IDE ide) {
        super(ide);
    }

    void coding() {
        ide.run();
        System.out.println("Java developer is coding...");
    };
}