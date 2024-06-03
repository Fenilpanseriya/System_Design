package models;

import java.util.List;

public class Floor extends BaseModal {
    private List<ParkingSpot> slots;
    private int floorNumber;

    public int getFloorNumber() {
        return floorNumber;
    }
    public List<ParkingSpot> getSlots() {
        return slots;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public void setSlots(List<ParkingSpot> slots) {
        this.slots = slots;
    }
}
