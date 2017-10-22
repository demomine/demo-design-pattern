package com.lance.demo.pattern.transparent;

/**
 * Created by immerer on 2017/10/22.
 */
public class CompositeDemo {

    public void composite() {
        Component leafA = new Leaf("a");
        Component leafB = new Leaf("b");
        Component leafC = new Leaf("c");
        Component leafD = new Leaf("d");

        Component compositeA = new Composite("a");
        compositeA.add(leafA);
        compositeA.add(leafB);

        Component compositeB = new Composite("b");
        compositeB.add(leafC);

        Component compositeD = new Composite("c");
        compositeD.add(compositeA);
        compositeD.add(compositeB);
        compositeD.add(leafD);

        compositeD.print("hello");
    }
}
