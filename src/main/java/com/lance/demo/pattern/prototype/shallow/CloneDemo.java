package com.lance.demo.pattern.prototype.shallow;

import com.lance.demo.pattern.prototype.Model;
import com.lance.demo.pattern.prototype.deep.SerialDemo;

public class CloneDemo implements Cloneable {
    private int age;

    private Model model;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public CloneDemo clone() {
        try {
            return (CloneDemo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CloneDemo{");
        sb.append("age=").append(age);
        sb.append(", model=").append(model);
        sb.append('}');
        return sb.toString();
    }
}
