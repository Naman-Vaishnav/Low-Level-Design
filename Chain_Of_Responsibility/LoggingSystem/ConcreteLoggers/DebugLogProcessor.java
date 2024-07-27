package Chain_Of_Responsibility.LoggingSystem.ConcreteLoggers;

import Chain_Of_Responsibility.LoggingSystem.LogProcessor;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel==DEBUG){
            System.out.println("Debug"+message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
