package Command.AC.Remote;

import Command.AC.Commands.CommandInterface;

//invoker
public class ACRemoteWithTwoButtons {
    CommandInterface button1Command;
    CommandInterface button2Command;

    //setCommand,exectueCommand

    public void setbutton1Command(CommandInterface command){
        this.button1Command=command;
    }

    public void setbutton2Command(CommandInterface command){
        this.button2Command=command;
    }

    //executebutton1Command
    public void pressedButton1(){
        this.button1Command.execute();
    }
     //executebutton2Command
    public void pressedButton2(){
        this.button2Command.execute();
    }



}
