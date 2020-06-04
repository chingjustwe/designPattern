package cn.com.nightfield.patterns.behavioral.memento;

/**
 * the caretaker, holds the memento
 * @author: nightfield
 * @create: 2020/6/3
 **/
public class ArchiveManager {
    // could be a list
    private GameArchive archive;

    public GameArchive getArchive() {
        return archive;
    }

    public void setArchive(GameArchive archive) {
        this.archive = archive;
    }
}