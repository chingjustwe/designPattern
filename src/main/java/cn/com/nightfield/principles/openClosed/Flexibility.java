package cn.com.nightfield.principles.openClosed;

import java.util.HashMap;
import java.util.Map;

/**
 * GOOD design!
 * system is flexible, if we want to change app function, we only need to change <code>AppFunction</code>
 * and would not impact other modules.
 *
 * @author: night field
 * @create: 2020/3/14
 **/
public class Flexibility {
    public static void main(String[] args) {
        AppFunction function = new ReadBook();
        App app = new App(function);
        Computer computer = new Computer(app);
        computer.openApp(function);
    }
}

class Computer {
    Map<AppFunction, App> apps = new HashMap<>();
    Computer(Map<AppFunction, App> apps) {
        this.apps = apps;
    }
    Computer(App app) {
        this.apps.put(app.getFunction(), app);
    }
    public void openApp(AppFunction function) {
        apps.get(function).open();
    }
}
class AppFunction {
    private String name;
    AppFunction(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class PlayMusic extends AppFunction {
    PlayMusic() {
        super("play music");
    }
}
class ReadBook extends AppFunction {
    ReadBook() {
        super("read book");
    }
}
class App<T extends AppFunction> {
    T function;
    App(T function) {
        this.function = function;
    }
    public void open() {
        System.out.format("App function is %s.", function.getName());
    }
    public AppFunction getFunction() {
        return function;
    }
}