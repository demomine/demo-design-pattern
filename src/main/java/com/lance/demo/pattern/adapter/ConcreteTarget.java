package com.lance.demo.pattern.adapter;

/**
 * Created by immerer on 2017/10/23.
 */
public class ConcreteTarget extends Adapter {
    public ConcreteTarget(Adaptee adaptee) {
        super(adaptee);
    }

    @Override
    public String getValue(String key) {
        return super.getValue(key);
    }
}
