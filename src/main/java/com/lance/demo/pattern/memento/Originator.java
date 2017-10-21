package com.lance.demo.pattern.memento;

public class Originator {
    private String value;

    public Originator(String value) {
        this.value = value;
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setValue(value);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
