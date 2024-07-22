package Problems.parkinglot;



import parkinglot.VehicleTypes.*;

public class Demo {

    public static void main(String[] args) {
        ParkingLot parkingLot=ParkingLot.getInstance();

        Level level1=new Level(1, 10);
        //level1.setSpots(3,VehicleType.CAR);
        //level1.setSpots(3,VehicleType.BICYCLE);
        //level1.setSpots(4,VehicleType.TRUCK);


        Level level2=new Level(1, 10);
        parkingLot.addLevel(level2);
        
        Vehicle car=new Car("Car-1");
        Vehicle truck=new Truck("Truck-2");
        Vehicle bicycle=new Bicycle("Bicycle-2");

        parkingLot.park(bicycle);
        parkingLot.park(car);
        parkingLot.park(truck);

        parkingLot.displayAvailability();
    }

    
}
