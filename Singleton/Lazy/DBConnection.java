package Singleton.Lazy;

public class DBConnection {

    private DBConnection(){};

    private static DBConnection instance;

    public static DBConnection getInstance(){
        if(instance==null){
            instance=new DBConnection();
        } 
        return instance;
    }

}
