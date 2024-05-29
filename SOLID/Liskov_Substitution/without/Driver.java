package Liskov_Substitution.without;

import java.util.ArrayList;
import java.util.List;

import Liskov_Substitution.without.Vehilces.Bicycle;
import Liskov_Substitution.without.Vehilces.Bike;
import Liskov_Substitution.without.Vehilces.Car;

public class Driver {
    public static void main(String[] args) {
        List<Vehicle> listOfVehicles=new ArrayList<>();
    
        listOfVehicles.add(new Bike());
        listOfVehicles.add(new Car());
        listOfVehicles.add(new Bicycle());

        for(Vehicle vehicle:listOfVehicles){
            System.out.println(vehicle.hasEngine().toString()); //NPE for bicycle
            //Changing subclass should break the code/behaviour
        }
    }
    
}
