package com.lance.demo.pattern.command;

import com.lance.demo.pattern.command.revoke.*;

public class App {
    public static void main(String[] args) {
        Operator operator = new Operator();
        CalCommand add = new AddCalCommand(operator);
        CalCommand reduce = new ReduceCommand(operator);

        Calculator calculator = new Calculator(add, reduce);

        calculator.add();//1
        calculator.add();//2
        calculator.reduce();//1
        calculator.add();//2
        calculator.revoke();//1
        calculator.revoke();//2
        calculator.redo();//1
        calculator.redo();//2

    }
}
