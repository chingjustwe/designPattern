package cn.com.nightfield.patterns.behavioral.state;

/**
 * the action of {@link Fighter} is decided by {@link State}, by using <b>State</b> pattern, we
 * decoupled state and it's target, and helping us avoid if-else or switch-case conditional
 * logic in this scenario.
 * @author: nightfield
 * @create: 2020/5/24
 **/
public class Test {
    public static void main(String[] args) {
        Fighter luffy = new Fighter();
        State hungryState = new HungryState();
        State angryState = new AngryState();

        luffy.fight();

        luffy.setState(hungryState);
        luffy.fight();

        luffy.setState(angryState);
        luffy.fight();
    }
}
