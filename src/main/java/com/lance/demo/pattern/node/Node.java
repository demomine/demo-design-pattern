package com.lance.demo.pattern.node;

/**
 * Created by immerer on 2017/10/20.
 */
public interface Node {
    void node(Visitor visitor);

    String getName();
}
