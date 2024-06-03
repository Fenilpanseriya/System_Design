package services;

import models.BaseModal;
import models.ParkingLot;
import repository.ParkingLotRepo;

public class ParkinglotService extends BaseModal {
    private ParkingLotRepo repo;
    public ParkinglotService(ParkingLotRepo repo){
        this.repo=repo;
    }
    private int counter=0;
    public ParkingLot createParkinglot(ParkingLot parkingLot){


        return repo.save(parkingLot);
    }

    public ParkingLot updateParkinglotAddress(int id,String address){
        return repo.updateAddress(id,address);
    }
}
