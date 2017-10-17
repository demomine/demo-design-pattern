package com.lance.demo.pattern;


import com.lance.demo.pattern.builder.*;

public class App {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person womanPerson = pd.constructPerson(new ManBuilder());
        Person manPerson = pd.constructPerson(new WomanBuilder());
        System.out.println(womanPerson.getAll());
        System.out.println(manPerson.getAll());
    }
}
