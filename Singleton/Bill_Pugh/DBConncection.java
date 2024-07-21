package Singleton.Bill_Pugh;

public class DBConncection {

    private DBConncection(){

    }

    private static class DBConncectionHelper{
       private static final DBConncection INSTANCE=new DBConncection(); 
    }

    public static DBConncection getInstance(){
        return DBConncectionHelper.INSTANCE;
    }
}
