package cn.com.nightfield.patterns.behavioral.mediator;

/**
 * ChatRoom is actually a <b>Mediator</b>
 * @author: nightfield
 * @create: 2020/5/29
 **/
public interface ChatRoom {
    void broadcast(String message, Member sender);
    void addMember(Member member);
    void removeMember(Member member);
}