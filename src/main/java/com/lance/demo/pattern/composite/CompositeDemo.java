package com.lance.demo.pattern.composite;

/**
 * Created by immerer on 2017/10/22.
 */
public class CompositeDemo {

    public void composite() {
        Leaf leafA = new Leaf("a");
        Leaf leafB = new Leaf("b");
        Leaf leafC = new Leaf("c");
        Leaf leafD = new Leaf("d");

        Composite compositeA = new Composite("a");
        compositeA.add(leafA);
        compositeA.add(leafB);

        Composite compositeB = new Composite("b");
        compositeB.add(leafC);

        Composite compositeD = new Composite("c");
        compositeD.add(compositeA);
        compositeD.add(compositeB);
        compositeD.add(leafD);

        compositeD.print("hello");
    }
}
