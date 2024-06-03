package dtos;

import models.EntryGate;
import models.SpotType;
import models.Vehical;

public class TicketRequestDto {
    private Vehical vehical;
    private EntryGate entryGate;
    private int parkingLotId;
    private SpotType type;

    public SpotType getType() {
        return type;
    }

    public void setType(SpotType type) {
        this.type = type;
    }

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public Vehical getVehical() {
        return vehical;
    }

    public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public void setVehical(Vehical vehical) {
        this.vehical = vehical;
    }
}
