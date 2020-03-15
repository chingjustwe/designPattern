package principles.interfaceSegregation;

/**
 * GOOD design!
 * Defined separate interfaces for different functions, shows good extensibility and
 * robust.
 *
 * @author: night field
 * @create: 2020/3/14
 **/
public class ISObedience {
    public static void main(String[] args) {
        swimmable person1 = new Swimmer();
        drivable person2 = new Driver();
        person1.swim();
        person2.drive();
    }
}
interface swimmable {
    void swim();
}
interface eatable {
    void eat();
}
interface drivable {
    void drive();
}

class Swimmer implements swimmable, eatable {
    @Override
    public void eat() {
        System.out.println("Swimmer is eating.");
    }
    @Override
    public void swim() {
        System.out.println("Swimmer is swimming.");
    }
}
class Driver implements drivable, eatable {
    @Override
    public void eat() {
        System.out.println("Driver is eating.");
    }
    @Override
    public void drive() {
        System.out.println("Driver is driving.");
    }
}