package com.lance.demo.pattern.bridge;

/**
 * Created by immerer on 2017/10/22.
 */
public class RedefineBAbstraction extends Abstraction {
    public RedefineBAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void otherOperation() {
        implementor.operationImpl();
        System.out.println("redefine B");
    }
}
