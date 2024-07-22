package Problems.parkinglot;

import java.util.ArrayList;
import java.util.List;
import parkinglot.VehicleTypes.Vehicle;


public class ParkingLot {
    final List<Level> levels;

    private ParkingLot(){
        levels=new ArrayList<>();
    }

    private static class SingletonInstance{
        private static final ParkingLot INSTANCE=new ParkingLot();
    }

    public static ParkingLot getInstance(){
        return SingletonInstance.INSTANCE;
    }

    public void addLevel(Level  level){
        levels.add(level);
    }

    public Boolean park(Vehicle vehicle){
        for(Level level:levels){
            if(level.park(vehicle))return true;
        }
        return false;
    }

    public Boolean unpark(Vehicle  vehicle){
        for(Level level:levels){
            if(level.unpark(vehicle))return true;
        }
        return false;
    }

    public void displayAvailability(){
        for(Level level:levels){
            level.displayAvailability();
        }
    }

    
}
