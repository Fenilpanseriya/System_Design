package controllers;

import dtos.TicketRequestDto;
import dtos.TicketResponseDto;
import models.EntryGate;
import models.SpotType;
import models.Ticket;
import models.Vehical;
import services.TicketService;

public class TicketController {
    private TicketService service;

    public TicketController(TicketService ticketService){
        this.service=ticketService;
    }
    public TicketResponseDto generateTicket(TicketRequestDto dto){
        Ticket generateTicket= service.generateTicket(dto.getVehical(),dto.getEntryGate(),dto.getParkingLotId(),dto.getType());

        TicketResponseDto responseDto=new TicketResponseDto();
        responseDto.setEntryGate(generateTicket.getEntryGate());
        responseDto.setEntryTime(generateTicket.getEntryTime());
        responseDto.setParkingSpot(generateTicket.getSpot());
        responseDto.setVehical(generateTicket.getVehical());

        System.out.println(generateTicket.getId());
        return responseDto;
    }

}
