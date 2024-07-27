package Chain_Of_Responsibility.LoggingSystem;

import Chain_Of_Responsibility.LoggingSystem.ConcreteLoggers.*;

public class Client {
    public static void main(String[] args) {
        LogProcessor logProcessor=new InfoLogProcessor(
            new DebugLogProcessor(
                new ErrorLogProcessor(null)));
        
        logProcessor.log(LogProcessor.DEBUG, "For debug");
        logProcessor.log(LogProcessor.INFO, "For info");
        logProcessor.log(LogProcessor.ERROR, "Error message");


    }
    
}
