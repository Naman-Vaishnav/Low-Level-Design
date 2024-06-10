package Command.AC.Remote;

import java.util.Stack;

import Command.AC.Commands.CommandInterface;

//invoker
public class ACRemoteWithSingleButton {

    Stack <CommandInterface> commandHistroy=new Stack<>();

    CommandInterface command;
   // CommandInterface turnOffCommand;

    public ACRemoteWithSingleButton(){
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
        if(commandHistroy.size()==0){
            System.out.println("No command to undo");
            return;
        }
        CommandInterface lastCommand=commandHistroy.pop();
        lastCommand.undo();

    }

}
