Requirements:
1)Multi level,each level contains parking spots
2)It should support different type for vehicles like cars,motorcycles,trucks
3)It should assign parking spot at time of entry and release it when the vehicle exits.
4)Real time availability
5)Multiple entry points and exits points


Classes:
ParkingLot
    levels:List<Level> -final
    instance           -for singleton

    -addLevel(Level)
    -park(Vehicle)
    -unPark(Vehicle)
    -displayAvailability()

Level
    parkingSpots:List<ParkingSpot> -final
    floor:Integer //key            -final 

    -park(Vehicle):Boolean
    -unPark(Vehicle):Boolean
    -displayAvailability()

ParkingSpot
    spotNumber:Integer //key        -final 
    type:VehicleType                -final 
    parkedVehicle:Vehicle
    entryTime:
    exitTime:

    -park(Vehicle):Boolean
    -unpark(Vehicle):Boolean

Vehicle(abstract-cannot be instantiated)
    type:VehicleType
    lincesePlate:String

VehicleType enum
    CAR,TRUCK,BICYCLE

Car IS-A Vehicle
Truck IS-A Vehicle
Bicycle IS-A Vehicle







