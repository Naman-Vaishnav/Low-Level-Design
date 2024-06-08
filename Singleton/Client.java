package Singleton;

//import Singleton.Eager.DBConnection;
import Singleton.Lazy.DBConnection;
//import Singleton.SynchronizedMethod.DBConnection;
//import  Singleton.VolatileKeyword.DBConnection;
//import Singleton.DoubleLocking.DBConnection;

public class Client {
 public static void main(String[] args) {
   

    Thread t1=new Thread(new Runnable()
      {
         public void run(){
            DBConnection instance=DBConnection.getInstance();
         }
      }     
    );

    Thread t2=new Thread(new Runnable(){
      public void run(){
         DBConnection instance=DBConnection.getInstance();
      }
    });
   
    t1.start();
    /*try {
      Thread.sleep(1000);
   } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   };*/
    t2.start();
   
    
    
 }
}
