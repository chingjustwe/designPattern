package cn.com.nightfield.patterns.behavioral.command;

/**
 * @author: nightfield
 * @create: 2020/6/1
 **/
public class ForwardCommand implements RemoteControlCommand {
    RemoteControlCar rcCar;
    public ForwardCommand(RemoteControlCar rcCar) {
        this.rcCar = rcCar;
    }

    @Override
    public void execute() {
        rcCar.moveForward();
    }

    @Override
    public void undo() {
        rcCar.moveBackward();
    }
}