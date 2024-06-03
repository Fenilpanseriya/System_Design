package models;

import java.util.List;

public class ParkingLot extends BaseModal {
    private List<Floor> floors;
    private List<EntryGate> entryGates;
    private List<ExitGate> exitGates;
    private String address;
    public ParkingLot (){
        
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }
    public String getAddress() {
        return address;
    }
    public List<EntryGate> getEntryGates() {
        return entryGates;
    }
    public List<ExitGate> getExitGates() {
        return exitGates;
    }
    public List<Floor> getFloors() {
        return floors;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEntryGates(List<EntryGate> entryGates) {
        this.entryGates = entryGates;
    }
    public void setExitGates(List<ExitGate> exitGates) {
        this.exitGates = exitGates;
    }
    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
}
