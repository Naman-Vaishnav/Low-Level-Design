package Command.AC.Commands;

import Command.AC.AirConditioner;

public class TurnACOffCommand implements CommandInterface {

    AirConditioner ac;

    public TurnACOffCommand(AirConditioner ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOff();;
    }

    @Override
    public void undo() {
        ac.turnOn();
    }

}
