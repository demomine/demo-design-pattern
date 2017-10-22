package com.lance.demo.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by immerer on 2017/10/22.
 */
public class FlyweightFactory {
    private Map<String,Flyweight> files = new HashMap<>();


    public Flyweight factory(String state){
        Flyweight fly = files.get(state);
        if(fly == null){
            fly = new ConcreteFlyweight(state);
            files.put(state, fly);
        }
        return fly;
    }

}
