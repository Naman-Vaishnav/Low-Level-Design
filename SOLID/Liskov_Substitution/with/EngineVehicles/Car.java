package Liskov_Substitution.with.EngineVehicles;

public class Car extends EngineVehicle{
    @Override
    protected Integer getNumberOfWheels() {
       return 4;
    }
}
