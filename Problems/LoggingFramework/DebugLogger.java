package Problems.LoggingFramework;

import Problems.LoggingFramework.Places.Observable.LogObservable;

public class DebugLogger extends AbstractLogger{
    
    DebugLogger(LogLevel level){
        this.level=level;
    }

    @Override
    protected void display(String message,LogObservable logObservable) {
        String msg="DEBUG :"+message;
        logObservable.update(LogLevel.DEBUG, msg);
    }

    

}

