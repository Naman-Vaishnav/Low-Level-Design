package Problems.LoggingFramework;

import Problems.LoggingFramework.Places.Observable.LogObservable;
import Problems.LoggingFramework.Places.Observable.LogObservableImpl;
import Problems.LoggingFramework.Places.Observers.ConsoleObserver;
import Problems.LoggingFramework.Places.Observers.FileObserver;
import Problems.LoggingFramework.Places.Observers.LogObserver;

public class LogManager {
    
   public static AbstractLogger buildChainOfLoggers(){
        AbstractLogger info=new InfoLogger(LogLevel.INFO);
        AbstractLogger error=new ErrorLogger(LogLevel.ERROR);
        AbstractLogger debug=new DebugLogger(LogLevel.DEBUG);

        info.setNextLogger(error);
        error.setNextLogger(debug);
    
        return info;    
   }

   public static LogObservable buildLogObservable(){
        LogObservable logObservable=new LogObservableImpl();

        LogObserver file=new FileObserver();
        LogObserver console=new ConsoleObserver();

        logObservable.add(LogLevel.INFO, file);
        
        logObservable.add(LogLevel.ERROR,console);
        logObservable.add(LogLevel.ERROR,file);

        logObservable.add(LogLevel.DEBUG, console);

        return logObservable;
   }

}
