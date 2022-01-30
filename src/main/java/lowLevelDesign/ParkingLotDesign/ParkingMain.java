package lowLevelDesign.ParkingLotDesign;

public class ParkingMain {
    public static void main(String[] args) {
        ParkingLot parkingLot=new ParkingLot(2,2,2);
        Vehicle truck =new Vehicle(VehicleType.TRUCK);

        parkingLot.parkVehicle(truck);
        parkingLot.unParkVehicle(truck);
    }
}
