package cn.com.nightfield.patterns.behavioral.command;

/**
 * the command
 * @author: nightfield
 * @create: 2020/6/1
 **/
public interface RemoteControlCommand {
    void execute();
    void undo();
}