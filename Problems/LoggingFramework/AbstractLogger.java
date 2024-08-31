package Problems.LoggingFramework;

import Problems.LoggingFramework.Places.Observable.LogObservable;

public abstract class AbstractLogger {
    LogLevel level;
    AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger=nextLogger;
    }

     void log(LogLevel level,String message,LogObservable logObservable){
        if(this.level.ordinal()==level.ordinal()){ //<= if you need all lower logger 
            display(message,logObservable);
        }
        if(nextLogger!=null){
            nextLogger.log(level, message,logObservable);
        }
    }

    protected abstract void display(String message,LogObservable logObservable);

}
