package cn.com.nightfield.patterns.behavioral.command;

/**
 * the command invoker
 * @author: nightfield
 * @create: 2020/6/1
 **/
public interface CarPlayer {
    void play();
    void undo();
    void setCommand(RemoteControlCommand command);
}