package com.lance.demo.pattern.bridge;

/**
 * Created by immerer on 2017/10/22.
 */
public class RedefineAAbstraction extends Abstraction {
    public RedefineAAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void otherOperation() {
        System.out.println("redefine A");
        operation();
    }
}
