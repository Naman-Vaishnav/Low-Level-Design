package Singleton.SynchronizedMethod;

public class DBConnection {

    private DBConnection(){System.out.println("In constructor");};

    private static DBConnection instance;
    
    //Multithreading Synchronized Keyword
    //https://www.youtube.com/watch?v=RH7G-N2pa8M
    synchronized public static DBConnection getInstance(){
        if(instance==null){
            instance=new DBConnection();
        } 
        return instance;
    }

    /*
     * The synchronized keyword can be used in the singleton design pattern to ensure that only one thread can execute a method at a time. However, using synchronized can be expensive and decrease program performance. This is because synchronization requires threads to wait for access to a shared resource, which can increase overhead. If performance isn't critical, synchronized can be a simple solution. However, if performance is important, other mechanisms like double check locking can be used instead. 
     */

}
