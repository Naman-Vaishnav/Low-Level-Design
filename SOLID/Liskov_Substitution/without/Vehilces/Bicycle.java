package Liskov_Substitution.without.Vehilces;

import Liskov_Substitution.without.Vehicle;

public class Bicycle extends Vehicle {
    @Override
    protected  Boolean hasEngine() {
        return null;
        //not implementing or returning true is not correct behaviour
    }
}
