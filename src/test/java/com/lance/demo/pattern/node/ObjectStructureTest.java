package com.lance.demo.pattern.node;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by immerer on 2017/10/20.
 */
public class ObjectStructureTest {


    @Test
    public void visit() {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addNode(new Node1());
        objectStructure.addNode(new Node2());

        Visitor visitorA = new VisitorA();
        objectStructure.accept(visitorA);

        Visitor visitorB = new VisitorB();
        objectStructure.accept(visitorB);

        Visitor visitorC = new VisitorC();
        objectStructure.accept(visitorC);
    }


}