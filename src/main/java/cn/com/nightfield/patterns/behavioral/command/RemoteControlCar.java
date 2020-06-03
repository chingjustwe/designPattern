package cn.com.nightfield.patterns.behavioral.command;

/**
 * the command receiver
 * @author: nightfield
 * @create: 2020/6/1
 **/
public interface RemoteControlCar {
    void moveForward();
    void turnLeft();
    void turnRight();
    void moveBackward();
}