package com.lance.demo.pattern.adapter;

/**
 * Created by immerer on 2017/10/23.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public String getValue(String key) {
        return adaptee.getValue(Integer.valueOf(key))+"";
    }
}
