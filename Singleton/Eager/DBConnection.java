package Singleton.Eager;

public class DBConnection {

    private DBConnection(){};

    private static DBConnection instance=new DBConnection();

    public static DBConnection getInstance(){
        return instance;
    }

}
