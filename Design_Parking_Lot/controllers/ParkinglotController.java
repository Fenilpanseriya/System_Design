package Design_Parking_Lot.controllers;
import dtos.ParkinglotRequestDto;
import dtos.ParkinglotResponseDto;
import dtos.UpdateAddressReqDto;
import dtos.UpdateAddressResDto;
import models.*;
import services.ParkinglotService;

import java.util.ArrayList;
import java.util.List;

public class ParkinglotController {
    ParkinglotService service;
    public ParkinglotController(services.ParkinglotService service){
        this.service=service;
    }

    public ParkinglotResponseDto createParkingLot(ParkinglotRequestDto request){
        ParkingLot parkingLot=new ParkingLot();
        parkingLot.setAddress(request.getAddress());
        List<Floor> parkingFloors=new ArrayList<>();
        List<EntryGate> entryGates=new ArrayList<>();
        List<ExitGate> exitGates=new ArrayList<>();
        for (int i=0;i<request.getNumOfEntryGates();i++){
            entryGates.add(new EntryGate());

        }
        for (int i=0;i<request.getNumOfExitGates();i++){
            exitGates.add(new ExitGate());

        }
        for(int i=0;i<request.getNumOfFloors();i++){
            parkingFloors.add(new Floor());
        }
        parkingLot.setEntryGates(entryGates);
        parkingLot.setExitGates(exitGates);
        parkingLot.setFloors(parkingFloors);
        ParkingLot createdParkingLot=service.createParkinglot(parkingLot);
        System.out.println(createdParkingLot.getId());

        ParkinglotResponseDto dto=new ParkinglotResponseDto();
        dto.setParkingLot(createdParkingLot);
        return dto;

    }

    public UpdateAddressResDto updateParkinglotAddress(UpdateAddressReqDto request){
        ParkingLot parkingLot=service.updateParkinglotAddress(request.getId(),request.getAddress());

        UpdateAddressResDto dto=new UpdateAddressResDto();
        dto.setParkingLot(parkingLot);
        return dto;
    }
}
