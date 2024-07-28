package Chain_Of_Responsibility.LoggingSystem;

public class LogProcessor {
    
    public static int ERROR=0;
    public static int INFO=1;
    public static int DEBUG=2;

     protected LogProcessor nexLogProcessor;

     

     protected LogProcessor(LogProcessor nextLogProcessor){
        this.nexLogProcessor=nextLogProcessor;
    }

    public void log(int logLevel,String message){
        if(nexLogProcessor!=null){
            nexLogProcessor.log(logLevel,message);
        }
    }
}
