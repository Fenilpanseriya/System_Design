package models;

public class ParkingSpot {
    private SpotType spotType;
    private ParkingLotStatus spotStatus;
    private int spotNumber;

    public int getSpotNumber() {
        return spotNumber;
    }
    public ParkingLotStatus getSpotStatus() {
        return spotStatus;
    }
    public SpotType getSpotType() {
        return spotType;
    }
    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }
    public void setSpotStatus(ParkingLotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }
    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }
}
