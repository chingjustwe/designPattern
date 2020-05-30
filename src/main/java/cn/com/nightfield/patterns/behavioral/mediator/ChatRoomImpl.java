package cn.com.nightfield.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: nightfield
 * @create: 2020/5/29
 **/
public class ChatRoomImpl implements ChatRoom {
    List<Member> memberList = new ArrayList<>();
    @Override
    public void broadcast(String message, Member sender) {
        for (Member member : memberList) {
            if (!member.equals(sender)) {
                member.receive(message);
            }
        }
    }

    @Override
    public void addMember(Member member) {
        if (!memberList.contains(member)) {
            memberList.add(member);
            member.setChatRoom(this);
        }
    }

    @Override
    public void removeMember(Member member) {
        memberList.remove(member);
    }
}