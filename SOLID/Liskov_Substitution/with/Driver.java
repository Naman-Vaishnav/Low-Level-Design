package Liskov_Substitution.with;

import java.util.ArrayList;
import java.util.List;

import Liskov_Substitution.with.EngineVehicles.Bike;
import Liskov_Substitution.with.EngineVehicles.Car;
import Liskov_Substitution.with.EngineVehicles.EngineVehicle;
import Liskov_Substitution.with.Bicycle;

public class Driver {
    public static void main(String[] args) {
        /*List<Vehicle> listOfVehicles=new ArrayList<>();
    
        listOfVehicles.add(new Bike());
        listOfVehicles.add(new Car());
        listOfVehicles.add(new Bicycle());   

        for(Vehicle vehicle:listOfVehicles){
            System.out.println(vehicle.hasEngine().toString()); //CE Bicycle doesn't have hasEngin method
        }*/

        /* 
        List<EngineVehicle> listOfVehicles=new ArrayList<>();
    
        listOfVehicles.add(new Bike());
        listOfVehicles.add(new Car());
        listOfVehicles.add(new Bicycle());   //CE Bicycle is not of type EngineVehicle

        for(Vehicle vehicle:listOfVehicles){
            System.out.println(vehicle.hasEngine().toString());
        }
        */
        List<Vehicle> listOfVehicles=new ArrayList<>();
    
        listOfVehicles.add(new Bike());
        listOfVehicles.add(new Car());
        listOfVehicles.add(new Bicycle());   

        for(Vehicle vehicle:listOfVehicles){
            System.out.println(vehicle.getNumberOfWheels().toString());
        }
    }
}
