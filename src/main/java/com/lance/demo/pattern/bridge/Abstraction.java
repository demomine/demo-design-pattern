package com.lance.demo.pattern.bridge;

/**
 * Created by immerer on 2017/10/22.
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImpl();
    }
}
