package Problems.LoggingFramework;

import java.io.Serializable;

import Problems.LoggingFramework.Places.Observable.LogObservable;

/*singleton for cloneable and Serializable
https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/

cloning : https://www.youtube.com/watch?v=KWbr7B5LDzs

serialization : https://www.youtube.com/watch?v=qo9S2CeoqQE
 * 
*/
public class Logger implements Cloneable,Serializable {

    private AbstractLogger chainOfLogger;
    private LogObservable logObservable;

    private Logger(){
        chainOfLogger=LogManager.buildChainOfLoggers();
        logObservable=LogManager.buildLogObservable();
    }
    
    //bill pugh
    private static class SingletonLogger{
        static final private Logger INSTANCE=new Logger();
    }

    public static Logger getInstance(){
        return SingletonLogger.INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve(){
        return SingletonLogger.INSTANCE;
    }



    public void logMessage(LogLevel level,String message){
        chainOfLogger.log(level, message,logObservable);
    }

    

}
