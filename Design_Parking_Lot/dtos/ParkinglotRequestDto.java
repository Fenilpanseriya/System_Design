package dtos;

public class ParkinglotRequestDto {
    String address;
    int numOfFloors;
    int numOfEntryGates;
    int numOfExitGates;

    public int getNumOfEntryGates() {
        return numOfEntryGates;
    }

    public int getNumOfExitGates() {
        return numOfExitGates;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumOfEntryGates(int numOfEntryGates) {
        this.numOfEntryGates = numOfEntryGates;
    }

    public void setNumOfExitGates(int numOfExitGates) {
        this.numOfExitGates = numOfExitGates;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }
}
