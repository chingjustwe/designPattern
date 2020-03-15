package principles.demeter;

/**
 * BAD design!
 * method <code>consumeTomato</code> and <code>consumeEgg</code> should be <b>private</b>, so that outside
 * classes can not destroy the data consistence of <code>Cook</code>.
 *
 * @author: night field
 * @create: 2020/3/14
 **/
public class WrongPrivilege {
    public static void main(String[] args) {
        Cook cook = new Cook();
        // accidentally consumed a tomato
        cook.consumeTomato();
        cook.cookSoup();
    }
}

class Cook {
    private int tomatoNum = 1;
    private int eggNum = 1;
    public boolean consumeTomato() {
        if (--tomatoNum >= 0) {
            System.out.println("Consumed a tomato.");
            return true;
        }
        else {
            System.out.println("Error: No tomato left!");
            return false;
        }
    }
    public boolean consumeEgg() {
        if (--eggNum >= 0) {
            System.out.println("Consumed an egg.");
            return true;
        }
        else {
            System.out.println("Error: No egg left!");
            return false;
        }
    }
    public void cookSoup() {
        if (consumeTomato() && consumeEgg()) {
            System.out.format("Cook soup successfully!");
        }
    }
}