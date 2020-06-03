package cn.com.nightfield.patterns.behavioral.command;

/**
 * @author: nightfield
 * @create: 2020/6/1
 **/
public class BackwardCommand implements RemoteControlCommand {
    RemoteControlCar rcCar;
    public BackwardCommand(RemoteControlCar rcCar) {
        this.rcCar = rcCar;
    }

    @Override
    public void execute() {
        rcCar.moveBackward();
    }

    @Override
    public void undo() {
        rcCar.moveForward();
    }
}