package models;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Doctor extends User {
    private String specialization;
    private HashMap<LocalDate, List<String>> slots=new HashMap<>();

    public Doctor(){}
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSlots(List<String> slot) {
        slots.put(LocalDate.now(),slot);
    }

    public List<String> getSlots(LocalDate date){
        return slots.get(date);
    }

    public void removeSlot(String slot){
        slots.get(LocalDate.now()).remove(slot);
        System.out.println("after remove booked slot");
        System.out.println(this.slots);
    }

}
