package com.lance.demo.pattern.composite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by immerer on 2017/10/22.
 */
public class FlyweightFactory {
    private Map<String, Flyweight> files = new HashMap<>();


    public Flyweight factory(List<String> compositeState){
        CompositeFlyweight compositeFly = new CompositeFlyweight();

        for(String state : compositeState){
            compositeFly.add(state,this.factory(state));
        }

        return compositeFly;
    }

    public Flyweight factory(String state){
        Flyweight fly = files.get(state);
        if(fly == null){
            fly = new ConcreteFlyweight(state);
            files.put(state, fly);
        }
        return fly;
    }

}
