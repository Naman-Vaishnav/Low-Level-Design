package Command.AC;

import Command.AC.Commands.CommandInterface;
import Command.AC.Commands.TurnACOnCommand;
import Command.AC.Remote.ACRemote;

public class Client {
    public static void main(String[] args) {
        AirConditioner ac=new AirConditioner();//reciver
        CommandInterface turnOnCommand=new TurnACOnCommand(ac);
        ACRemote remote=new ACRemote(turnOnCommand);

        remote.pressedOnButton();
        remote.pressedOffButton();
        }
}
