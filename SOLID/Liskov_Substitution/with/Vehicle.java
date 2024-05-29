package Liskov_Substitution.with;

public class Vehicle{
    protected Integer getNumberOfWheels(){
        return 2;
    }
    //Parent class should only gave generic methods
    //Child class should extend the functionality of parent not norrow it down
    /*protected Boolean hasEngine(){
        return true;
    }*/
}