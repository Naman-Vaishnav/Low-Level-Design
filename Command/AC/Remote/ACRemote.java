package Command.AC.Remote;

import java.util.Stack;

import Command.AC.Commands.CommandInterface;

//invoker
public class ACRemote {

    Stack <CommandInterface> commandHistroy=new Stack<>();

    CommandInterface command;
   // CommandInterface turnOffCommand;

    public ACRemote(){
    }

    public void setCommand(CommandInterface command){
        this.command=command;
    }

    public void executeCommand(){
        this.command.execute();

        commandHistroy.push(command);
    }

    //undo
    public void undoCommand(){ 
        //this.command.unexecute();

        CommandInterface lastCommand=commandHistroy.pop();
        lastCommand.undo();

    }

}
