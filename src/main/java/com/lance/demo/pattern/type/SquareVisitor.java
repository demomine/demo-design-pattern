package com.lance.demo.pattern.type;

import com.lance.demo.pattern.node.Node;

/**
 * Created by immerer on 2017/10/21.
 */
public class SquareVisitor implements TypeVisitor {
    @Override
    public void visit(Type type) {
        type.getSquare();
    }
}
