package Singleton;

import Singleton.Eager.DBConnection;

public class Client {
 public static void main(String[] args) {
    DBConnection instance=DBConnection.getInstance();
 }
}
