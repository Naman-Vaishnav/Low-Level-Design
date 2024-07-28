package Problems.LoggingFramework.Places.Observable;

import Problems.LoggingFramework.LogLevel;
import Problems.LoggingFramework.Places.Observers.LogObserver;

public interface LogObservable {
    
    void add(LogLevel level,LogObserver logObserver);

    void update(LogLevel level,String message);

}
