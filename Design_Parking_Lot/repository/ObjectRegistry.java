package repository;

import Design_Parking_Lot.controllers.ParkinglotController;
import services.ParkinglotService;

import java.util.HashMap;
import java.util.Map;

public class ObjectRegistry {
    private static Map<String,Object>registery=new HashMap<>();

    public ParkinglotService getParkingLotService(){
        return (ParkinglotService)registery.get("parkingLotService");
    }
    public ParkingLotRepo getParkingLotRepo(){
        return (ParkingLotRepo)registery.get("parkinLotRepositiory");
    }
    public  ParkinglotController getParkingLotController(){
        return (ParkinglotController)registery.get("parkingLotController");
    }
    public static void  put(String str,Object o){
        registery.put(str,o);
    }
    public static  Object get(String name){
        return registery.get(name);
    }
}
