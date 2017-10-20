package com.lance.demo.pattern.visitor;


import com.lance.demo.pattern.visitor.course.*;

//object structure
public class EastWestDemo {
    public void visit() {
        //组合1
        East east = new SubEast1();
        West west = new SubWest1();
        east.goEast(west);
        //组合2
        east = new SubEast1();
        west = new SubWest2();
        east.goEast(west);
    }
}
