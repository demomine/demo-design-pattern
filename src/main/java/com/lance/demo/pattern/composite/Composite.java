package com.lance.demo.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by immerer on 2017/10/22.
 */
public class Composite implements Component {
    private List<Component> components = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }
    public void add(Component component) {
        components.add(component);
    }

    public void delete(Component component) {
        components.remove(component);
    }
    @Override
    public void print(String str) {
        System.out.println(name +"  " + str);
        components.forEach(component -> component.print(str));
    }
}
