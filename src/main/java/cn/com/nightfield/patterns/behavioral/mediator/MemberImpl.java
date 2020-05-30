package cn.com.nightfield.patterns.behavioral.mediator;

/**
 * @author: nightfield
 * @create: 2020/5/29
 **/
public class MemberImpl extends Member {
    public MemberImpl(String name) {
        super(name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " send message: " + message);
        chatRoom.broadcast(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received message: " + message);
    }
}