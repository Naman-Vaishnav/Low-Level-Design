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
     * 
     * However, synchronization can also introduce performance overhead. This is because the JVM must acquire and release locks on shared resources, which can be a time-consuming process. Additionally, when a thread is waiting to acquire a lock, it is blocked and cannot perform any other work.
There are a few reasons why synchronized can be slow in Java:
Lock contention:
When multiple threads are trying to acquire the same lock at the same time, they must contend for the lock. This can lead to long wait times for threads, and can significantly reduce the performance of the application.
Context switching:
When a thread is blocked waiting for a lock, the JVM must switch to another thread. This can be a costly operation, and can further reduce the performance of the application.
Unnecessary synchronization:
If you synchronize code that does not need to be synchronized, this can introduce unnecessary overhead. For example, if you synchronize a method that only reads data, this can prevent other threads from reading the data even though it is not being modified.

Here are some tips for using synchronization effectively and avoiding performance problems:

Only synchronize code that needs to be synchronized.
Avoid synchronizing code that does not need to be synchronized, such as code that only reads data.
Use fine-grained synchronization.
Instead of synchronizing entire methods, synchronize only the specific blocks of code that need to be synchronized. This can help to reduce lock contention and improve performance.
Use lock hierarchies.
If you have multiple locks, organize them into a hierarchy. This can help to reduce lock contention and improve performance.
Use alternative concurrency mechanisms.
In some cases, you may be able to use alternative concurrency mechanisms, such as concurrent collections or lock-free data structures, to avoid the overhead of synchronization.
     */

}
