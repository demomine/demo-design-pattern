package com.lance.demo.pattern.visitor.course;

/**
 * Created by immerer on 2017/10/20.
 */
public class SubEast1 extends East {
    @Override
    public void goEast(West west) {
        west.goWest(this);
    }

    public String myName1() {
        return "SubEast1";
    }
}
