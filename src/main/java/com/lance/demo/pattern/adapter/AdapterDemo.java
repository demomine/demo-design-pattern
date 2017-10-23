package com.lance.demo.pattern.adapter;

/**
 * Created by immerer on 2017/10/23.
 */
public class AdapterDemo {
    public void adapter() {
        Adaptee adaptee = new Adaptee();
        Target target = new ConcreteTarget(adaptee);

        System.out.println(target.getValue("10"));

        Adapter adapter = new Adapter(adaptee);
        System.out.println(adapter.getValue("20"));
    }
}
