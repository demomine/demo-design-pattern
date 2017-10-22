package com.lance.demo.pattern.transparent;

/**
 * Created by immerer on 2017/10/22.
 */
public abstract class Component {
    protected void add(Component component){
        throw new UnsupportedOperationException("leaf not support this function");
    }

    protected void delete(Component component) {
        throw new UnsupportedOperationException("leaf not support this function");
    }

    protected abstract void print(String str);
}
