package cn.com.nightfield.patterns.behavioral.visitor;

/**
 * @author: nightfield
 * @create: 2020/5/29
 **/
public class Test {
    public static void main(String[] args) {
        Fruit apple = new Apple(12, 1);
        Fruit orange = new Orange(5, 3);
        Fruit banana = new Banana(8, 2);

        Visitor visitor = new FruitVisitor();
        int totalCost = visitor.getTotalCost(apple, orange, banana);
        System.out.println("Total cost: " + totalCost);
    }
}
