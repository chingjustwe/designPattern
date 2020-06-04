package cn.com.nightfield.patterns.behavioral.memento;

/**
 * Memento allows making snapshots of an object’s state and restoring it in future.
 * @author: nightfield
 * @create: 2020/6/3
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ArchiveManager manager = new ArchiveManager();
        Game dmc = new Game();
        dmc.play();
        System.out.println("Game init status: " + dmc);
        manager.setArchive(dmc.save());
        dmc.play();
        System.out.println("Game new status: " + dmc);
        dmc.restore(manager.getArchive());
        System.out.println("Game status after restore: " + dmc);
    }
}
