package Command.AC.Remote;

import Command.AC.Commands.CommandInterface;

//invoker
public class ACRemote {
    CommandInterface turnOnCommand;
   // CommandInterface turnOffCommand;

    public ACRemote(CommandInterface turnOnCommand){
        //this.turnOffCommand=turnOffCommand;
        this.turnOnCommand=turnOnCommand;
    }

    public void pressedOnButton(){
        this.turnOnCommand.execute();
    }

    public void pressedOffButton(){
        this.turnOnCommand.unexecute();
    }

}
