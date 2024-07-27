package Problems.parkinglot;

import java.util.ArrayList;
import java.util.List;

import parkinglot.VehicleTypes.Vehicle;
import parkinglot.VehicleTypes.VehicleType;

public class Level {
    final  List<ParkingSpot>  parkingSpots;
    final Integer floor;

    Level(Integer floor,Integer numOfSpots){
        this.floor=floor;
        parkingSpots=new ArrayList<>(numOfSpots);
        for(int i=0;i<numOfSpots;i++){
            parkingSpots.add(new ParkingSpot(i,VehicleType.CAR));
        }
    }

    synchronized public Boolean park(Vehicle vehicle){
        for(ParkingSpot spot:parkingSpots){
            if(spot.isAvailable()&&spot.getType()==vehicle.getType()){
                spot.park(vehicle);
                return true;
            }
        }
        return false;
    }

    synchronized public Boolean unpark(Vehicle vehicle){
        for(ParkingSpot spot:parkingSpots){
            if(!spot.isAvailable()&&spot.parkedVehicle==vehicle){
                spot.unpark(vehicle);
                return true;
            }
        }
        return false;
    }

    public void displayAvailability(){
        System.out.println("Level"+floor);
        for(ParkingSpot spot:parkingSpots){
           // if(!spot.isAvailable())continue;
            System.out.println(
                "Spot:"+spot.getSpotNumber()+" "+(
                spot.isAvailable()?"Available":"Unavailable")
            );
        }
    }

}
