package com.lance.demo.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by immerer on 2017/10/22.
 */
public class CompositeDemo {
    public void composite() {
        List<String> compositeState = new ArrayList<>();
        compositeState.add("a");
        compositeState.add("b");
        compositeState.add("c");
        compositeState.add("d");
        compositeState.add("e");

        FlyweightFactory flyFactory = new FlyweightFactory();
        Flyweight compositeFly1 = flyFactory.factory(compositeState);
        Flyweight compositeFly2 = flyFactory.factory(compositeState);
        compositeFly1.operation("Composite Call");

        System.out.println("---------------------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

        String state = "a";
        Flyweight fly1 = flyFactory.factory(state);
        Flyweight fly2 = flyFactory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }
}
