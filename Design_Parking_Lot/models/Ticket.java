package models;

import java.util.Date;

public class Ticket extends BaseModal {
    private SpotType spotType;
    private int spotNumber;
    private Operator operator;
    private Date entryTime;
    private ParkingSpot spot;
    private EntryGate entryGate;
    private Vehical vehical;

    public Vehical getVehical() {
        return vehical;
    }

    public void setVehical(Vehical vehical) {
        this.vehical = vehical;
    }

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public void setSpot(ParkingSpot spot) {
        this.spot = spot;
    }

    public Date getEntryTime() {
        return entryTime;
    }
    public Operator getOperator() {
        return operator;
    }
    public int getSpotNumber() {
        return spotNumber;
    }
    public SpotType getSpotType() {
        return spotType;
    }
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }
    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public Ticket generateTicket(){
        return null;
    }

}
