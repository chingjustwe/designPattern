package cn.com.nightfield.patterns.behavioral.memento;

/**
 * The Originator
 * @author: nightfield
 * @create: 2020/6/3
 **/
public class Game {
    private int gameStage = 1;
    private int characterLevel = 1;
    private int monsterKilled = 0;

    public void play() throws InterruptedException {
        System.out.println("Playing Game...");
        gameStage += 1;
        characterLevel += 5;
        monsterKilled += 10;
    }

    // create a memento
    public GameArchive save() {
        System.out.println("game saved!");
        return new GameArchive(gameStage, characterLevel, monsterKilled);
    };

    // restore to a previous state based on a memento
    public void restore(GameArchive archive) {
        System.out.println("game rollback!");
        gameStage = archive.getGameStage();
        characterLevel = archive.getCharacterLevel();
        monsterKilled = archive.getMonsterKilled();
    }

    @Override
    public String toString() {
        return "game stage is " + gameStage +
                ", character level is " + characterLevel +
                ", monster killed is " + monsterKilled;
    }
}