package com.lance.demo.pattern.type;


public class ResultVisitor implements TypeVisitor {
    @Override
    public void visit(Type type) {
        System.out.println(type.getResult());
    }
}
