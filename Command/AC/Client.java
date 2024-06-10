package Command.AC;

import Command.AC.Commands.CommandInterface;
import Command.AC.Commands.TurnACOffCommand;
import Command.AC.Commands.TurnACOnCommand;
import Command.AC.Remote.ACRemoteWithSingleButton;
import Command.AC.Remote.ACRemoteWithTwoButtons;
import Command.AC.Remote.ACRemoteWithSingleButton;

public class Client {
    public static void main(String[] args) {

        AirConditioner ac=new AirConditioner();//reciver

        /*ACRemoteWithSingleButton remote1=new ACRemoteWithSingleButton();

        remote1.setCommand(new TurnACOnCommand(ac));
        remote1.executeCommand();//Turing on...

        remote1.setCommand(new TurnACOffCommand(ac));
        remote1.executeCommand();//Turing off...
        
        remote1.undoCommand();//Turing on...
        remote1.undoCommand();//Turing off...
        remote1.undoCommand();//No command to undo
        */

        ACRemoteWithTwoButtons remote2=new ACRemoteWithTwoButtons();
        //configure the buttons
        remote2.setbutton1Command(new TurnACOnCommand(ac));
        remote2.setbutton2Command(new TurnACOffCommand(ac));
        //user presses the button
        remote2.pressedButton1();//Turing on...
        remote2.pressedButton2();//Turing off...



        }
}
