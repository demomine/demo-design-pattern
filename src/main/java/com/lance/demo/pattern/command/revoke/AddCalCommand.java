package com.lance.demo.pattern.command.revoke;

public class AddCalCommand implements CalCommand {
    private Operator operator;

    public AddCalCommand(Operator operator) {
        this.operator = operator;
    }

    @Override
    public void execute() {
        operator.add();
    }

    @Override
    public void undo() {
        operator.reduce();
    }
}
