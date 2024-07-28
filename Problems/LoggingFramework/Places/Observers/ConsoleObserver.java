package Problems.LoggingFramework.Places.Observers;

public class ConsoleObserver implements LogObserver {
    
     public void update(String message){
        System.out.println("In CONSOLE: "+message);
    }
}
