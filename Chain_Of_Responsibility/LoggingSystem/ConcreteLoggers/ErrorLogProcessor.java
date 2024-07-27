package Chain_Of_Responsibility.LoggingSystem.ConcreteLoggers;

import Chain_Of_Responsibility.LoggingSystem.LogProcessor;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel==ERROR){
            System.out.println("Error"+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
    
}
