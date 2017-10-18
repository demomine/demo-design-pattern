package com.lance.demo.pattern.command.revoke;

public class Operator {
    private int count = 0;

    public void add() {
        count++;
        System.out.println(count);
    }

    public void reduce() {
        count--;
        System.out.println(count);
    }

}
