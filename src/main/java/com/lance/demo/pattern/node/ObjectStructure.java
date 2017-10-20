package com.lance.demo.pattern.node;

import java.util.ArrayList;
import java.util.List;


public class ObjectStructure {
    private List<Node> nodes = new ArrayList<>();

    public void accept(Visitor visitor) {
        nodes.forEach(node -> node.node(visitor));

    }

    public void addNode(Node node) {
        nodes.add(node);
    }
}
