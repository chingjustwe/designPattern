package cn.com.nightfield.patterns.structural.composite;

/**
 * Compose objects into tree structures to represent part-whole hierarchies.
 * Composite lets clients treat individual objects and compositions of objects uniformly.<br>
 *
 * To execute a new policy, we only need to invoke method <code>work</code> in {@link Director}
 *
 * @author: nightfield
 * @create: 2020/3/29
 **/
public class Test {
    public static void main(String[] args) {
        Director director = new Director("Polly");
        Manager frontendManager = new Manager("Lilei");
        Manager backendManager = new Manager("Hanmeimei");
        Engineer jsEngineer = new Engineer("Lily");
        Engineer ueDesigner = new Engineer("Lucy");
        Engineer javaEngineer = new Engineer("Jim");
        Engineer dbAdmin = new Engineer("Kate");
        director.addChild(frontendManager);
        director.addChild(backendManager);
        frontendManager.addChild(jsEngineer);
        frontendManager.addChild(ueDesigner);
        backendManager.addChild(javaEngineer);
        backendManager.addChild(dbAdmin);

        director.work();
    }
}
