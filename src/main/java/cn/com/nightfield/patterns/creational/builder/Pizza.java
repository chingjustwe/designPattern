package cn.com.nightfield.patterns.creational.builder;

/**
 * @author: nightfield
 * @create: 2020/3/21
 **/
public class Pizza {
    private int size;// inch
    private CrustType crustType;
    private String topping;
    private boolean cheese;// optional

    private Pizza(Builder builder) {
        if (builder.size <= 0) {
            throw new IllegalStateException("Invalid pizza size.");
        }
        if (builder.crustType == null) {
            throw new IllegalStateException("Invalid pizza crust type.");
        }
        if (builder.topping == null) {
            throw new IllegalStateException("Invalid pizza topping.");
        }
        this.size = builder.size;
        this.crustType = builder.crustType;
        this.topping = builder.topping;
        this.cheese = builder.cheese;
    }

    public int getSize() {
        return size;
    }

    public CrustType getCrustType() {
        return crustType;
    }

    public String getTopping() {
        return topping;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void info() {
        System.out.println("Pizza size: " + size + ", crust type: " + crustType + ", topping: " + topping + ", with cheese: " + cheese);
    }

    public static enum CrustType {
        THIN, THICK
    }

    // inner class to build Pizza
    public static class Builder {
        private int size;
        private CrustType crustType;
        private String topping;
        private boolean cheese = false;

        public Builder size(int size) {
            this.size = size;
            return this;
        }
        public Builder crustType(CrustType crustType) {
            this.crustType = crustType;
            return this;
        }
        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }
        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }
}