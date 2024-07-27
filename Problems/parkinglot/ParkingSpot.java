package Problems.parkinglot;

import parkinglot.VehicleTypes.Vehicle;
import parkinglot.VehicleTypes.VehicleType;

public class ParkingSpot {
    final Integer spotNumber;
    VehicleType type;
    Vehicle parkedVehicle;

    ParkingSpot(Integer spotNumber,VehicleType type){
        this.spotNumber=spotNumber;
        this.type=type;
    }

    synchronized Boolean isAvailable(){
        return parkedVehicle==null;
    }

    public VehicleType getType(){
        return type;
    }

    public Integer getSpotNumber(){
        return spotNumber;
    }

    synchronized Boolean park(Vehicle vehicle){
        if(isAvailable()){
            parkedVehicle=vehicle;
            return true;
        }
        return false;
    }

    synchronized void unpark(Vehicle vehicle){
        parkedVehicle=null;
    }

}
