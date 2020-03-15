package principles.interfaceSegregation;

/**
 * BAD design!
 * Defined an interface contains separate functions(swim, drive), causes subclasses to implement
 * useless method, and lead to incorrect behaviors.
 *
 * @author: night field
 * @create: 2020/3/14
 **/
public class ISViolation {
    public static void main(String[] args) {
        Person person1 = new Swimmer1();
        Person person2 = new Driver1();
        person1.drive();
        person2.swim();
    }
}
interface Person {
    void eat();
    void swim();
    void drive();
}
class Swimmer1 implements Person {
    @Override
    public void eat() {
        System.out.println("Swimmer is eating.");
    }
    @Override
    public void swim() {
        System.out.println("Swimmer is swimming.");
    }
    @Override
    public void drive() {
        System.out.println("Sorry, swimmer can't drive!");
    }
}
class Driver1 implements Person {
    @Override
    public void eat() {
        System.out.println("Driver is eating.");
    }
    @Override
    public void swim() {
        System.out.println("Sorry, driver can't swim!");
    }
    @Override
    public void drive() {
        System.out.println("Driver is driving.");
    }
}