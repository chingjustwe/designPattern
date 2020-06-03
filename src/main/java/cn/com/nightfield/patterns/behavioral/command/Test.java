package cn.com.nightfield.patterns.behavioral.command;

/**
 * Command Pattern turns a request into a stand-alone object that contains all information
 * about the request, decoupled request receiver and request invoker. it allows you parameterize
 * methods with different requests, delay or queue a request’s execution, and even support
 * undoable operations.
 * @author: nightfield
 * @create: 2020/5/29
 **/
public class Test {
    public static void main(String[] args) {
        RemoteControlCar remoteControlCar = new RemoteControlCarImpl();
        RemoteControlCommand moveCommand = new ForwardCommand(remoteControlCar);
        RemoteControlCommand turnLeftCommand = new TurnLeftCommand(remoteControlCar);
        RemoteControlCommand turnRightCommand = new TurnRightCommand(remoteControlCar);
        RemoteControlCommand stopCommand = new BackwardCommand(remoteControlCar);

        CarPlayer kid = new Kid(moveCommand);
        kid.play();
        kid.undo();
        kid.setCommand(turnLeftCommand);
        kid.play();
        kid.setCommand(turnRightCommand);
        kid.play();
        kid.setCommand(stopCommand);
        kid.play();
        kid.undo();
    }
}
