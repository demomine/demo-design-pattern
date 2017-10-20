package com.lance.demo.pattern.node;

/**
 * Created by immerer on 2017/10/20.
 */
public class Node2 implements Node {
    @Override
    public void node(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return "node2";
    }
}
