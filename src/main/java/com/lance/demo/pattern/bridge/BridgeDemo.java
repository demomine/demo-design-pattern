package com.lance.demo.pattern.bridge;

/**
 * Created by immerer on 2017/10/22.
 */
public class BridgeDemo {
    public void bridge() {
        Implementor implementorA = new ImplementorA();
        Implementor implementorB = new ImplementorB();

        RedefineAAbstraction abstractionA = new RedefineAAbstraction(implementorA);
        RedefineBAbstraction abstractionB = new RedefineBAbstraction(implementorB);

        abstractionA.otherOperation();
        abstractionB.otherOperation();

        Abstraction abstractionAB = new RedefineAAbstraction(implementorB);
        Abstraction abstractionBA = new RedefineBAbstraction(implementorA);

        abstractionAB.operation();
        abstractionBA.operation();
    }
}
