package Strategy;

import models.*;

public interface SpotAssignStrategy {
    public ParkingSpot assignSpot(ParkingLot p, EntryGate entryGate, SpotType type);
}
