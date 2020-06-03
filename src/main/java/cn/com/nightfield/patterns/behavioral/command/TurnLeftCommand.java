package cn.com.nightfield.patterns.behavioral.command;

/**
 * @author: nightfield
 * @create: 2020/6/1
 **/
public class TurnLeftCommand implements RemoteControlCommand {
    RemoteControlCar rcCar;
    public TurnLeftCommand(RemoteControlCar rcCar) {
        this.rcCar = rcCar;
    }

    @Override
    public void execute() {
        rcCar.turnLeft();
    }

    @Override
    public void undo() {
        rcCar.turnRight();
    }
}