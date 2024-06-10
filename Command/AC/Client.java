package Command.AC;

import Command.AC.Commands.CommandInterface;
import Command.AC.Commands.TurnACOffCommand;
import Command.AC.Commands.TurnACOnCommand;
import Command.AC.Remote.ACRemote;

public class Client {
    public static void main(String[] args) {

        AirConditioner ac=new AirConditioner();//reciver
        ACRemote remote=new ACRemote();

        remote.setCommand(new TurnACOnCommand(ac));
        remote.executeCommand();//Turing on...

        remote.setCommand(new TurnACOffCommand(ac));
        remote.executeCommand();//Turing off...
        
        remote.undoCommand();//Turing on...
        }
}
