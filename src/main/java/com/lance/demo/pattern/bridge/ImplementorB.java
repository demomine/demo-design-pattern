package com.lance.demo.pattern.bridge;

/**
 * Created by immerer on 2017/10/22.
 */
public class ImplementorB extends Implementor {
    @Override
    public void operationImpl() {
        System.out.println("impl B");
    }
}
