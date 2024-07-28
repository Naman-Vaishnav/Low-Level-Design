package Problems.LoggingFramework.Places.Observers;

public class FileObserver implements LogObserver {

    @Override
    public void update(String message) {
        System.out.println("In FILE: "+message);
    }
    
}
