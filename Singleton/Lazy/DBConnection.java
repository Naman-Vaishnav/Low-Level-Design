package Singleton.Lazy;

public class DBConnection {

    private DBConnection(){System.out.println("In constructor");};

    private static DBConnection instance;

    public static DBConnection getInstance(){
        if(instance==null){
            instance=new DBConnection();
        } 
        return instance;
    }

}
