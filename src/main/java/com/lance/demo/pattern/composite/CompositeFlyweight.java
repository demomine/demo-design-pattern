package com.lance.demo.pattern.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by immerer on 2017/10/22.
 */
public class CompositeFlyweight implements Flyweight {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();


    public void add(String state,Flyweight flyweight) {
        flyweightMap.put(state, flyweight);
    }
    @Override
    public void operation(String state) {
        flyweightMap.forEach((key,value)->{
            value.operation(state);
            System.out.println("operate key: "+key+"  state: "+ state);
    });
    }
}
