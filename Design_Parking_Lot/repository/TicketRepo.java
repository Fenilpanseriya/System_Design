package repository;

import models.Ticket;

import java.util.*;

public class TicketRepo {
    private Map<Integer, Ticket>ticketRepo=new HashMap<>();
    private int ticketId=0;
    public Ticket save(Ticket ticket){
        ticketId++;
        ticketRepo.put(ticketId,ticket);
        return ticketRepo.get(ticketId);
    }
}
