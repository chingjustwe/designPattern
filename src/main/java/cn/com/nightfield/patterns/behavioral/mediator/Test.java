package cn.com.nightfield.patterns.behavioral.mediator;

/**
 * for case <b>Group Chat</b>, all members in the group should communicate with each other.instead
 * of coupling all {@link Member} together, we can add a <b>Mediator</b> class {@link ChatRoom} which
 * all members only relay on it. in such way, we decoupled all member's relationship.
 * @author: nightfield
 * @create: 2020/5/29
 **/
public class Test {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoomImpl();
        Member link = new MemberImpl("Link");
        Member mario = new MemberImpl("Mario");
        Member yoshi = new MemberImpl("Yoshi");

        chatRoom.addMember(link);
        chatRoom.addMember(mario);
        chatRoom.addMember(yoshi);

        link.send("Hello");
    }
}
