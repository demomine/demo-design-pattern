package com.lance.demo.pattern.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> mementos = new Stack<>();

    public Memento getMemento() {
        return mementos.pop();
    }

    public void putMemento(Memento memento) {
        mementos.push(memento);
    }
}
