package cn.com.nightfield.patterns.structural.bridge;

/**
 * Bridge pattern follows the notion to prefer <b>Composition</b> over <b>inheritance</b>.
 * Client can have lots of combinations about {@link Developer} and {@link IDE} without affecting
 * the source, {@link Developer} and {@link IDE} like two side of a bridge, they can change separately.
 *
 * @author: nightfield
 * @create: 2020/3/29
 **/
public class Test {
    public static void main(String[] args) {
        IDE Intellij = new Intellij();
        Developer nightfield = new JavaDeveloper(Intellij);
        nightfield.coding();

        IDE vim = new Vim();
        Developer rocky = new JavaDeveloper(vim);
        rocky.coding();

        IDE vsCode = new VSCode();
        Developer daisy = new PythonDeveloper(vsCode);
        daisy.coding();
    }
}
