package com.lance.demo.pattern;

import com.lance.demo.pattern.memento.Caretaker;
import com.lance.demo.pattern.memento.Originator;

public class MementoDemo {
    public void memento() {
        Originator originator = new Originator("a");
        System.out.println(originator.getValue());

        Caretaker caretaker = new Caretaker();
        caretaker.putMemento(originator.createMemento());

        originator.setValue("b");
        System.out.println(originator.getValue());
        caretaker.putMemento(originator.createMemento());

        originator.setValue("c");
        System.out.println(originator.getValue());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getValue());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getValue());

    }
}
