package com.lance.demo.pattern.node;

/**
 * Created by immerer on 2017/10/20.
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(Node1 node) {
        System.out.println(node.getName()+"node1" + getName());
    }

    @Override
    public void visit(Node2 node) {
        System.out.println("node2" + getName()+node.getName());
    }

    private String getName() {
        return "visitorA";
    }
}
