package cn.com.nightfield.patterns.behavioral.mediator;

/**
 * @author: nightfield
 * @create: 2020/5/29
 **/
public abstract class Member {
    protected ChatRoom chatRoom;
    protected String name;

    public Member(String name){
        this.name=name;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}