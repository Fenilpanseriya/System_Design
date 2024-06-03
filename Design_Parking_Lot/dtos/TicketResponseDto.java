package dtos;

import models.EntryGate;
import models.ParkingSpot;
import models.Vehical;

import java.util.Date;

public class TicketResponseDto {
    private Vehical vehical;
    private EntryGate entryGate;
    private ParkingSpot parkingSpot;
    private Date entryTime;
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehical getVehical() {
        return vehical;
    }

    public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
    }


    public void setVehical(Vehical vehical) {
        this.vehical = vehical;
    }
}
