package parkinglot.VehicleTypes;

public abstract class Vehicle {
    VehicleType type;
    String lincese;

    public Vehicle( VehicleType type, String lincese){
        this.lincese=lincese;
        this.type=type;
     }

     public VehicleType getType(){
        return type;
     }
}
