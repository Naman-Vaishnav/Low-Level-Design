package Singleton.Eager;

public class DBConnection {

    private DBConnection(){System.out.println("In constructor");};

    private static DBConnection instance=new DBConnection();

    public static DBConnection getInstance(){
        return instance;
    }

}
