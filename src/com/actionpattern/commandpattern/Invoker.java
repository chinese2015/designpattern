package com.actionpattern.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    List<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void removeCommand(Command command){
        commands.remove(command);
    }

    public void notifyCommands(){
        for(Command command:commands){
            command.execute();
        }
    }
}
