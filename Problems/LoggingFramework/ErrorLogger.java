
package Problems.LoggingFramework;

import Problems.LoggingFramework.Places.Observable.LogObservable;

public class ErrorLogger extends AbstractLogger{
    
    ErrorLogger(LogLevel level){
        this.level=level;
    }

    @Override
    protected void display(String message,LogObservable logObservable) {
        String msg="ERROR : "+message;
        logObservable.update(level, msg);

    }

    

}
