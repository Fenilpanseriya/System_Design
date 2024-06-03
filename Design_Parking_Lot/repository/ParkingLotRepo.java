package repository;

import models.ParkingLot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotRepo {
    private Map<Integer,ParkingLot> parkingLots=new HashMap<>();
    private int counter=0;

    public ParkingLot save(ParkingLot parkingLot){
        counter++;
        parkingLot.setId(counter);
        parkingLots.put(counter,parkingLot);
        return parkingLot;
    }

    public ParkingLot getById(int id){
        return parkingLots.get(id);
    }

    public ParkingLot updateAddress(int id,String address){
        ParkingLot p=parkingLots.get(id);
        p.setAddress(address);
        return p;
    }
}
