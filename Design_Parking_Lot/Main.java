// Requirements 

// 1. There should be multiple entry and exit gates
// 2. multiple floors in parking lot
// 3. each floor have different slot type for each type of vehical
// 4. ticket will be generated at entry gate 
// 5. ticket contain info of slot type &  no. , entry time, and by whom ticket is generated
// 6. There are different price per hour according to entry time and different multiplers based on how much time vehicle is parked
// 7. bill will be generated based on vehicle type,entry time and parking duration hours
// 8. there is electric vehical parking slot with charging facility 
// 9. bill for electrical vehical above 7th points plus how much electricity is consumed by electric vehicale for charging
// 10. for paying bill there should be different method like cash,CC,DC,UPI etc..
import Design_Parking_Lot.controllers.ParkinglotController;


import Strategy.RandomSpotAssignStrategy;
import Strategy.SpotAssignStrategy;
import controllers.TicketController;
import dtos.*;
import models.*;
import repository.ObjectRegistry;
import repository.ParkingLotRepo;
import repository.TicketRepo;
import services.ParkinglotService;
import services.TicketService;

public class Main {
    public static void main(String[] args) {

        ObjectRegistry.put("parkinLotRepositiory",new ParkingLotRepo());
        ObjectRegistry.put("parkingLotService",new ParkinglotService((ParkingLotRepo) ObjectRegistry.get("parkinLotRepositiory")));

        ObjectRegistry.put("parkingLotController",new ParkinglotController((ParkinglotService)ObjectRegistry.get("parkingLotService")));
        ObjectRegistry.put("ticketRepository",new TicketRepo());
        ObjectRegistry.put("spotAssignmentStrategy", new RandomSpotAssignStrategy());
        ObjectRegistry.put("ticketService",new TicketService(
                (SpotAssignStrategy) ObjectRegistry.get("spotAssignmentStrategy"),
                (TicketRepo) ObjectRegistry.get("ticketRepository"),
                (ParkingLotRepo) ObjectRegistry.get("parkinLotRepositiory")
        ));
        ObjectRegistry.put("ticketController",new TicketController((TicketService) ObjectRegistry.get("ticketService")));

        ParkinglotRequestDto dto=new ParkinglotRequestDto();
        dto.setAddress("ahmedabad airport");
        dto.setNumOfEntryGates(2);
        dto.setNumOfFloors(3);
        dto.setNumOfExitGates(2);
        ParkinglotController p=(ParkinglotController) ObjectRegistry.get("parkingLotController");
        ParkinglotResponseDto parkinglot=p.createParkingLot(dto);

        System.out.println(parkinglot.getParkingLot().getAddress());
        System.out.println(parkinglot.getParkingLot().getId());
        System.out.println(parkinglot.getParkingLot().getFloors());
        System.out.println(parkinglot.getParkingLot().getEntryGates());
        System.out.println(parkinglot.getParkingLot().getExitGates());

        //update address of parking lot
        UpdateAddressReqDto updateReqDto=new UpdateAddressReqDto();
        updateReqDto.setAddress("Bangalore airport");
        updateReqDto.setId(1);

        UpdateAddressResDto updateResDto=p.updateParkinglotAddress(updateReqDto);
        System.out.println(updateResDto.getParkingLot().getAddress());

        //generate ticket

        TicketRequestDto request=new TicketRequestDto();

        Vehical v=new Vehical();
        v.setVehical(VehicalType.CAR);
        v.setVehicalNumber("GJ11XX2004");
        request.setVehical(v);

        EntryGate entryGate=new EntryGate();
        Operator operator=new Operator();
        operator.setName("Raju");
        entryGate.setGateType(GateType.ENTRY);
        entryGate.setOperator(operator);
        request.setEntryGate(entryGate);
        request.setParkingLotId(1);

        TicketController ticketController=(TicketController)ObjectRegistry.get("ticketController");
        TicketResponseDto responseDto=ticketController.generateTicket(request);

    }
}
