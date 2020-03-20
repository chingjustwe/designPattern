package cn.com.nightfield.principles.liskovSubstitution;

/**
 * BAD design!
 * Square overrides the parent's method, and changes the parent's default behavior accidentally
 *
 * @author: night field
 * @create: 2020/3/14
 **/
public class WrongOverride {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setWidth(3);
        rectangle.setLength(5);
        System.out.format("expect rectangle area to be %d, actual is %d", 3 * 5, rectangle.getArea());
    }
}

class Rectangle {
    private int width;
    private int length;
    public void setWidth(int width) {
        this.width = width;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getArea() {
        return width * length;
    }
}

class Square extends Rectangle {
    // set length same as width
    public void setWidth(int width) {
        super.setLength(width);
        super.setWidth(width);
    }
    // set width same as length
    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }
}