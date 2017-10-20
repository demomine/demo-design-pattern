package com.lance.demo.pattern.type;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by immerer on 2017/10/21.
 */
public class Processor {
    private List<Type> types = new ArrayList<>();

    public void add(Type type) {
        types.add(type);
    }

    public void accept(TypeVisitor visitor) {
        types.forEach(type -> type.type(visitor));
    }

}
