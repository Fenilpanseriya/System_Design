package services;

import Strategy.SpotAssignStrategy;
import models.*;
import repository.ParkingLotRepo;
import repository.TicketRepo;

import java.util.Date;

public class TicketService {
    private SpotAssignStrategy strategy;
    private  TicketRepo repo;
    private ParkingLotRepo parkingLotRepo;
    public  TicketService(SpotAssignStrategy strategy, TicketRepo repo, ParkingLotRepo parkingRepo){
        this.repo=repo;
        this.strategy=strategy;
        this.parkingLotRepo=parkingRepo;
    }

    public Ticket generateTicket(Vehical vehical, EntryGate entryGate,int id,SpotType type){
        ParkingLot p=parkingLotRepo.getById(id);
        ParkingSpot spot=strategy.assignSpot(p,entryGate,type);

        if(p==null || spot==null){
            return null;
        }
        Ticket ticket=new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setOperator(entryGate.getOperator());
        ticket.setSpot(spot);
        ticket.setEntryGate(entryGate);
        ticket.setVehical(vehical);

        return repo.save(ticket);
    }

}
