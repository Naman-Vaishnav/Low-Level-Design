package Problems.LoggingFramework.Places.Observable;
import java.util.*;

import Problems.LoggingFramework.LogLevel;
import Problems.LoggingFramework.Places.Observers.LogObserver;

public class LogObservableImpl implements LogObservable {

    Map<LogLevel,List<LogObserver>> logObservers=new HashMap<>();

    @Override
    public void add(LogLevel level,LogObserver logObserver) {
        List<LogObserver> curList=logObservers.getOrDefault(level, new ArrayList<LogObserver>() );

        curList.add(logObserver);

        logObservers.put(level, curList);
    }

    @Override
    public void update(LogLevel level,String message) {
        
        //for(LogLevel level:logObservers.keySet()){
            List<LogObserver> curList=logObservers.get(level);
            for(LogObserver curObserver:curList){
                curObserver.update(message);
            }
        //}

    }
    
}
