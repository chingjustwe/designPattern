package cn.com.nightfield.patterns.behavioral.command;

/**
 * @author: nightfield
 * @create: 2020/6/1
 **/
public class TurnRightCommand implements RemoteControlCommand {
    RemoteControlCar rcCar;
    public TurnRightCommand(RemoteControlCar rcCar) {
        this.rcCar = rcCar;
    }

    @Override
    public void execute() {
        rcCar.turnRight();
    }

    @Override
    public void undo() {
        rcCar.turnLeft();
    }
}