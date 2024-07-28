package Problems.LoggingFramework;

import Problems.LoggingFramework.Places.Observable.LogObservable;

public class InfoLogger extends AbstractLogger{
    
    InfoLogger(LogLevel level){
        this.level=level;
    }

    @Override
    protected void display(String message,LogObservable logObservable) {
        String msg="INFO : "+message;

        logObservable.update(level, msg);
    }

    

}
