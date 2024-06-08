package Singleton.VolatileKeyword;

public class DBConnection {

    private DBConnection(){System.out.println("In constructor");};

    //https://www.youtube.com/watch?v=upfrQvOgC24&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=33
    private volatile static DBConnection instance;
    
     public static DBConnection getInstance(){
        if(instance==null){
            synchronized (DBConnection.class){
                if(instance==null){
                    instance=new DBConnection();
                }
            }
            
        } 
        return instance;
    }

   
}
