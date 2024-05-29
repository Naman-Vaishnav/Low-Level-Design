package Liskov_Substitution.with;

public class Vehicle{
    protected Integer getNumberOfWheels(){
        return 2;
    }
    //Parent class should only gave generic methods
    /*protected Boolean hasEngine(){
        return true;
    }*/
}