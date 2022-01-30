package lowLevelDesign.ParkingLotDesign;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<CompactSpot> compactSpotList = new ArrayList<>();
    List<LargeSpot> largeSpotList = new ArrayList<>();
    List<BikeSpot> bikeSpotList = new ArrayList<>();
    int freeCompact;
    int freeLarge;
    int freeBike;

    public ParkingLot(int freeCompact, int freeTruck, int freeBike) {
        this.freeCompact = freeCompact;
        this.freeLarge = freeTruck;
        this.freeBike = freeBike;
    }

    //parking vehicle
    public void parkVehicle(Vehicle vehicle) {
        System.out.println("We are about to park your vehicle of type " + vehicle.getVehicleType());
        if (vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
            if (freeLarge > 0) {
                parkYourLargeVehicle(vehicle);
            } else {
                System.out.println("Sorry no space to park your vehicle");
            }

        } else if (vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if (freeCompact > 0) {
                parkYourCompactVehicle(vehicle);
            } else if (freeLarge > 0) {
                parkYourLargeVehicle(vehicle);

            } else {
                System.out.println("Sorry no space to park your vehicle");
            }

        } else if (vehicle.getVehicleType().equals(VehicleType.BIKE)) {
            if (freeBike > 0) {
                parkYourBikeVehicle(vehicle);
            } else if (freeCompact > 0) {
                parkYourCompactVehicle(vehicle);
            } else if (freeLarge > 0) {
                parkYourLargeVehicle(vehicle);

            } else {
                System.out.println("Sorry no space to park your vehicle");
            }

        }

    }

    private void parkYourBikeVehicle(Vehicle vehicle) {
        BikeSpot bikeSpot =new BikeSpot(ParkingSpotType.BIKE);
        bikeSpot.setFree(false);
        bikeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(bikeSpot);

        bikeSpotList.add(bikeSpot);
        System.out.println("We have successfully parked your vehicle of type "+vehicle.getVehicleType());
        freeBike--;
    }

    private void parkYourCompactVehicle(Vehicle vehicle) {
        CompactSpot compactSpot=new CompactSpot(ParkingSpotType.COMPACT);
        compactSpot.setFree(false);
        compactSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(compactSpot);
        compactSpotList.add(compactSpot);
        System.out.println("We have successfully parked your vehicle of type "+vehicle.getVehicleType());

        freeCompact--;
    }

    private void parkYourLargeVehicle(Vehicle vehicle) {
        LargeSpot largeSpot= new LargeSpot(ParkingSpotType.LARGE);
        largeSpot.setFree(false);
        largeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(largeSpot);
        largeSpotList.add(largeSpot);

        System.out.println("We have successfully parked your vehicle of type "+vehicle.getVehicleType());
        freeLarge--;

    }

    public void unParkVehicle(Vehicle vehicle){
        System.out.println("We are about to unpark your vehicle of type "+vehicle.getVehicleType()+"  parked in this parking lot ");
        ParkingSpot parkingSpot =vehicle.getParkingSpot();
        //parkingSpot.setFree(true);
        if(vehicle.getVehicleType().equals(VehicleType.TRUCK)){
            if(largeSpotList.remove(parkingSpot)){
                System.out.println("we have successfully removed your vehicle ");
                freeLarge++;
            }else System.out.println("you dont have parked your vehicle here in this parking Lot ");

        }else if (vehicle.getVehicleType().equals(VehicleType.CAR)){
            if(compactSpotList.remove(parkingSpot)){
                System.out.println("we have successfully removed your vehicle ");
                freeCompact++;
            }else System.out.println("you dont have parked your vehicle here in this parking Lot ");


        }else if (vehicle.getVehicleType().equals(VehicleType.BIKE)){
            if(bikeSpotList.remove(parkingSpot)){
                System.out.println("we have successfully removed your vehicle ");
                freeBike++;
            }else System.out.println("you dont have parked your vehicle here in this parking Lot ");


        }


    }

}
