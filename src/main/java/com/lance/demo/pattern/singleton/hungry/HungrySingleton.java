package com.lance.demo.pattern.singleton.hungry;

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("init hungry");
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void hello() {
        System.out.println("hello");
    }
}
