package Chain_Of_Responsibility.LoggingSystem.ConcreteLoggers;

import Chain_Of_Responsibility.LoggingSystem.LogProcessor;

public class InfoLogProcessor extends LogProcessor{
    
    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel==INFO){
            System.out.println("Info"+message);
        }
        else{
            super.log(logLevel, message);
        }
    }

}
