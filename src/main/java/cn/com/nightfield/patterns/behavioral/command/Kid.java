package cn.com.nightfield.patterns.behavioral.command;

/**
 * happy children's day
 * @author: nightfield
 * @create: 2020/6/1
 **/
public class Kid implements CarPlayer {
    RemoteControlCommand command;
    public Kid(RemoteControlCommand command) {
        this.command = command;
    }

    @Override
    public void setCommand(RemoteControlCommand command) {
        this.command = command;
    }

    @Override
    public void play() {
        command.execute();
    }

    @Override
    public void undo() {
        command.undo();
    }
}