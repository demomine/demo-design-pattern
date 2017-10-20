package com.lance.demo.pattern.prototype;

import com.lance.demo.pattern.prototype.deep.SerialDemo;
import com.lance.demo.pattern.prototype.shallow.CloneDemo;

public class PrototypeDemo {
    private CloneDemo cloneDemo = new CloneDemo();
    private SerialDemo serialDemo = new SerialDemo();


    public void cloneDemo() {
        Model model = new Model("a");
        cloneDemo.setAge(1);
        cloneDemo.setModel(model);
        System.out.println(cloneDemo);

        CloneDemo newDemo = cloneDemo.clone();
        newDemo.getModel().setId("b");
        System.out.println(cloneDemo);
        System.out.println(newDemo);
    }

    public void serialDemo() {
        Model model = new Model("a");
        serialDemo.setAge(1);
        serialDemo.setModel(model);
        System.out.println(serialDemo);

        SerialDemo newSerial = serialDemo.cloneDemo();
        newSerial.getModel().setId("b");
        System.out.println(serialDemo);
        System.out.println(newSerial);
    }
}
