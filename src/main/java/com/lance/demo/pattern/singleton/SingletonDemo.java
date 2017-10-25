package com.lance.demo.pattern.singleton;

import com.lance.demo.pattern.singleton.full.FullSingleton;
import com.lance.demo.pattern.singleton.hungry.HungrySingleton;

public class SingletonDemo {
    public void hungry() {
        HungrySingleton.getInstance().hello();
    }

    public void full() {
        FullSingleton.getInstance().hello();
    }
}
