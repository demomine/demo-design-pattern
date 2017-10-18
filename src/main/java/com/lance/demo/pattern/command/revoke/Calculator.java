package com.lance.demo.pattern.command.revoke;

import java.util.LinkedList;
import java.util.List;

public class Calculator {
    private CalCommand addCmd;
    private CalCommand reduceCmd;
    private List<CalCommand> undoCommands;
    private List<CalCommand> redoCommands;

    public Calculator(CalCommand addCmd, CalCommand reduceCmd) {
        this.addCmd = addCmd;
        this.reduceCmd = reduceCmd;
        undoCommands = new LinkedList<>();
        redoCommands = new LinkedList<>();
    }

    public void add() {
        this.addCmd.execute();
        undoCommands.add(this.addCmd);
    }

    public void reduce() {
        this.reduceCmd.execute();
        undoCommands.add(this.reduceCmd);
    }

    public void revoke() {
        if (this.undoCommands.size() > 0) {
            CalCommand calCommand = this.undoCommands.get(undoCommands.size() - 1);
            calCommand.undo();
            this.redoCommands.add(calCommand);
            this.undoCommands.remove(undoCommands.size() - 1);
        } else {
            System.out.println("no undo available");
        }

    }

    public void redo() {
        if (this.redoCommands.size() > 0) {
            CalCommand calCommand = this.redoCommands.get(redoCommands.size() - 1);
            calCommand.execute();
            this.undoCommands.add(calCommand);
            this.redoCommands.remove(redoCommands.size() - 1);
        } else {
            System.out.println("no redo available");
        }

    }
}
