package com.lance.demo.pattern.visitor.course;

/**
 * Created by immerer on 2017/10/20.
 */
public class SubEast2 extends East {
    @Override
    public void goEast(West west) {
        west.goWest(this);
    }

    public String myName2() {
        return "SubEast2";
    }
}
