package Strategy;

import models.*;

public class RandomSpotAssignStrategy implements SpotAssignStrategy {
    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot,EntryGate entryGate,SpotType type) {
        for(Floor parkingFloor:parkingLot.getFloors()){
            for(ParkingSpot parkingSpot:parkingFloor.getSlots()){
                if(parkingSpot.getSpotStatus().equals(ParkingLotStatus.AVAILABLE) &&
                    parkingSpot.getSpotType().equals(type)){
                    parkingSpot.setSpotStatus(ParkingLotStatus.OCCUPIED);
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
