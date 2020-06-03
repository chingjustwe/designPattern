package cn.com.nightfield.patterns.behavioral.command;

/**
 * @author: nightfield
 * @create: 2020/6/1
 **/
public class RemoteControlCarImpl implements RemoteControlCar {
    @Override
    public void moveForward() {
        System.out.println("The car is moving forward!");
    }

    @Override
    public void turnLeft() {
        System.out.println("The car turns left!");
    }

    @Override
    public void turnRight() {
        System.out.println("The car turns right!");
    }

    @Override
    public void moveBackward() {
        System.out.println("The car is moving backward!");
    }
}