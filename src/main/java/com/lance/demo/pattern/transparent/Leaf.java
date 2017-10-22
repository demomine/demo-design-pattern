package com.lance.demo.pattern.transparent;

/**
 * Created by immerer on 2017/10/22.
 */
public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void print(String str) {
        System.out.println("leaf  " + name + "  " + str);
    }
}
