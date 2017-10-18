package com.lance.demo.pattern.command.revoke;

public class ReduceCommand implements CalCommand {
    private Operator operator;

    public ReduceCommand(Operator operator) {
        this.operator = operator;
    }

    @Override
    public void execute() {
        operator.reduce();
    }

    @Override
    public void undo() {
        operator.add();
    }
}
