package com.lance.demo.pattern.builder2;

public class Product {
    final private String name;
    final private int level;

    public Product() {
        this(new Product.Builder());
    }

    private Product(Product.Builder builder) {//为什么 是 private
        this.name = builder.name;
        this.level = builder.level;
    }

    public String name() {
        return name;
    }

    public int level() {
        return level;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static final class Builder {
        private String name;
        private int level;
        public Builder(){
            name = "lance";
            level = 10;
        }

     /*   public static Builder newBuilder() {
            return new Builder();
        }*/

        Builder(Product product) {//省略 public
            this.level = product.level;
            this.name = product.name;
        }
        Builder name(String name) {
            this.name = name;
            return this;
        }

        Builder level(int level) {
            this.level = level;
            return this;
        }

        Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }
}
