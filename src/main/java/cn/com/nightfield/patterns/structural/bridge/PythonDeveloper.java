package cn.com.nightfield.patterns.structural.bridge;

/**
 * @author: nightfield
 * @create: 2020/3/30
 **/
public class PythonDeveloper extends Developer {

    PythonDeveloper(IDE ide) {
        super(ide);
    }

    void coding() {
        ide.run();
        System.out.println("Python developer is coding...");
    };
}