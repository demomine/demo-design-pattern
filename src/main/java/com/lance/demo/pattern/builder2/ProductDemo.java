package com.lance.demo.pattern.builder2;

public class ProductDemo {
    public void build() {
        Product product = new Product();
        System.out.println(product);
        Product productNew = product.newBuilder().level(20).build();
        System.out.println(productNew);
        System.out.println(product);
        Product productNewNew = new Product.Builder(product).name("test").build();
        System.out.println(product);
        System.out.println(productNewNew);
    }
}
