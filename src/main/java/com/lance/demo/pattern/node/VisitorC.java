package com.lance.demo.pattern.node;

/**
 * Created by immerer on 2017/10/20.
 */
public class VisitorC implements Visitor {
    @Override
    public void visit(Node1 node) {
        System.out.println("finish");
    }

    @Override
    public void visit(Node2 node) {
        System.out.println("finish");
    }
}
