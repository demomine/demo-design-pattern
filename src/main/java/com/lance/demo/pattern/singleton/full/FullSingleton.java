package com.lance.demo.pattern.singleton.full;

public class FullSingleton {
    private static FullSingleton fullSingleton = null;

    private FullSingleton() {
        System.out.println("full singleton");
    }

    public static FullSingleton getInstance() {
        if (fullSingleton == null) {
            synchronized (FullSingleton.class) {
                if (fullSingleton == null) {
                    fullSingleton = new FullSingleton();
                    return fullSingleton;
                }

            }
        }
        return fullSingleton;
    }

    public void hello() {
        System.out.println("hello");
    }
}
