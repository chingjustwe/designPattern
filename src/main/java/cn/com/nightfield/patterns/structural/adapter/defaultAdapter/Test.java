package cn.com.nightfield.patterns.structural.adapter.defaultAdapter;

/**
 *
 * @author: nightfield
 * @create: 2020/4/2
 **/
public class Test {
    public static void main(String[] args) {
        People jay = new Singer();
        jay.speak();
        People yao = new Athlete();
        yao.move();
    }
}
