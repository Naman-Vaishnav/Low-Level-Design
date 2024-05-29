package Liskov_Substitution.without.Vehilces;

import Liskov_Substitution.without.Vehicle;

public class Car extends Vehicle{
    @Override
    protected Integer getNumberOfVehicle() {
        return 4;
    }
}
