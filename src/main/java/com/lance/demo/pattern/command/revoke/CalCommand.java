package com.lance.demo.pattern.command.revoke;

public interface CalCommand {
    void execute();
    void undo();
}
