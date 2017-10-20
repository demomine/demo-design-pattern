package com.lance.demo.pattern.visitor.course;

/**
 * Created by immerer on 2017/10/20.
 */
public class SubWest2 extends West {
    @Override
    public void goWest(SubEast1 subEast1) {
        System.out.println("SubWest2 " + subEast1.myName1());
    }

    @Override
    public void goWest(SubEast2 subEast2) {
        System.out.println("SubWest2 " + subEast2.myName2());
    }
}
