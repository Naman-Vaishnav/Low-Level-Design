package Command.AC.Commands;

import Command.AC.AirConditioner;

public class TurnACOnCommand implements CommandInterface {

    AirConditioner ac;

    public TurnACOnCommand(AirConditioner ac ){
        this.ac=ac;
    }

    public void execute(){
        ac.turnOn();
    }

    public void undo(){
        ac.turnOff();
    }

}
