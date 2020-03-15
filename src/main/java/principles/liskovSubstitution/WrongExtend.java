package principles.liskovSubstitution;

/**
 * BAD design!
 * Whale is actually not a fish, so can not extend class <b>Fish</b>
 *
 * @author: night field
 * @create: 2020/3/14
 **/
public class WrongExtend {
    public static void main(String[] args) {
        Fish fish = new Whale();
        fish.breath();
    }
}

class Fish {
    private String name;
    Fish(String name) {
        this.name = name;
    }
    public void breath() {
        System.out.format("I'm %s, I breath with cheek.");
    }
}

class Whale extends Fish {
    Whale() {
        super("whale");
    }
}