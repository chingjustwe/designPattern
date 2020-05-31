package cn.com.nightfield.patterns.behavioral.templateMethod;

/**
 * this is a template method, provided the framework of making a pizza, sub-classes
 * only need to override method <b>processTopping</b> to make different pizzas.
 * @author: nightfield
 * @create: 2020/5/30
 **/
public abstract class PizzaCook {
    public final void bakePizza() {
        processCrust();
        processTopping();
        bake();
        System.out.println("Pizza is now baked!!!");
    }

    private void processCrust() {
        System.out.println("Crust is ready...");
    }
    private void bake() {
        System.out.println("Putting the pizza to oven...");
    };

    protected abstract void processTopping();

}