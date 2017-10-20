package com.lance.demo.pattern.prototype.deep;

import com.lance.demo.pattern.prototype.Model;

import java.io.*;

public class SerialDemo implements Serializable{
    private int age;

    private Model model;

    public SerialDemo cloneDemo() {

        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (SerialDemo) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SerialDemo{");
        sb.append("age=").append(age);
        sb.append(", model=").append(model);
        sb.append('}');
        return sb.toString();
    }
}
