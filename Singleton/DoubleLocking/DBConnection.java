package Singleton.DoubleLocking;

public class DBConnection {

    private DBConnection(){};

    private static DBConnection instance;
    
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

    //Singleton Design Pattern using enum
    //https://www.youtube.com/watch?v=YOi5i-93lgo&list=PLsyeobzWxl7rqhgfVySFnwhtS4QUT4805&index=5

   
}