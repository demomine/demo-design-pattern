package com.lance.demo.pattern.node;

/**
 * Created by immerer on 2017/10/20.
 */
public interface Visitor {
    void visit(Node1 node);
    void visit(Node2 node);
}
