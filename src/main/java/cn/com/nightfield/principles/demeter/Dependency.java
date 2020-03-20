package cn.com.nightfield.principles.demeter;

/**
 * GOOD design!
 * class <code>Computer</code> only coupled with <code>App</code>, <code>App</code> is only coupled with
 * <code>Music</code>. if one module need to be changed, only directly related module would be impacted.
 *
 * @author: night field
 * @create: 2020/3/14
 **/
public class Dependency {
    public static void main(String[] args) {
        Music music = new Music("See you again");
        App app = new App(music);
        Computer computer = new Computer(app);
        computer.openApp();
    }
}

class Computer {
    App app;
    Computer(App app) {
        this.app = app;
    }
    public void openApp() {
        app.open();
    }
}
class App {
    Music music;
    App(Music music) {
        this.music = music;
    }
    public void open() {
        System.out.format("App is playing %s.", music.getName());
    }
}
class Music {
    private String name;
    Music(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}