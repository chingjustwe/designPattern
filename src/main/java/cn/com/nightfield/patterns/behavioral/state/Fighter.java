package cn.com.nightfield.patterns.behavioral.state;

/**
 * by setting different state, fighter can fight with different power
 * @author: nightfield
 * @create: 2020/5/24
 **/
public class Fighter implements State {
    private State state = new NormalState();

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public void fight() {
        state.fight();
        /*String mode = "angry";
        if (mode.equalsIgnoreCase("angry")) {
            System.out.println("Fighting with power 200 on angry mode!!!");
        }
        else if (mode.equalsIgnoreCase("hungry")) {
            System.out.println("Fighting with power 50 on mode hungry...");
        }
        else {
            System.out.println("Fighting with power 100 normal mode!");
        }*/
    }
}