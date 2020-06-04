package cn.com.nightfield.patterns.behavioral.memento;

/**
 * the memento class, holds the previous state
 * @author: nightfield
 * @create: 2020/6/3
 **/
public class GameArchive {
    private int gameStage = 1;
    private int characterLevel = 1;
    private int monsterKilled = 0;

    public GameArchive(int gameStage, int characterLevel, int monsterKilled) {
        this.gameStage = gameStage;
        this.characterLevel = characterLevel;
        this.monsterKilled = monsterKilled;
    }

    public int getGameStage() {
        return gameStage;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public int getMonsterKilled() {
        return monsterKilled;
    }
}