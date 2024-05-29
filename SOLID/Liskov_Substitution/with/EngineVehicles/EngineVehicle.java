package Liskov_Substitution.with.EngineVehicles;

import Liskov_Substitution.with.Vehicle;

public class EngineVehicle extends Vehicle{
    protected Boolean hasEngine(){
        return true;
    }
}
