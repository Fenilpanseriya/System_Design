package repository;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Doctor;

public class DoctorRepo {
    private Map<Integer,Doctor> doctors=new HashMap<>();
    private int counter=0;

    public Doctor  save(Doctor p){
        p.setId(""+counter);
        doctors.put(counter, p);
        counter++;
        System.out.println("register successfull...");
        return p;
    }
    public Doctor geDoctorById(int id){
        return doctors.get(id);
    }

    public Doctor getDoctorByName(String name){
        for (Doctor doctor : doctors.values()) {
            if (doctor.getName().equals(name)) {
                System.out.println(doctor.getSlots(LocalDate.now()));
                return doctor;
            }
        }
        return null;
    }

    public List<String> getSlotsBySpeciality(String speciality){
        List<String>slots=new ArrayList<>();
        for(Doctor doctor:doctors.values()){
            if(doctor.getSpecialization().equals(speciality)){
                slots.add(doctor.getName()+" -> "+doctor.getSlots(LocalDate.now()));
            }
        }
        return slots;
    }

    public void addSlot(LocalTime start,LocalTime end, Doctor d){
        if (Duration.between(start, end).toHours() > 1) {
            throw new IllegalArgumentException("Time slot cannot be longer than one hour.");
        }
        List<String> slots=d.getSlots(LocalDate.now());
        if(slots==null){
            slots=new ArrayList<>();
        }
        slots.add(start+"-"+end);
        d.setSlots(slots);

        int id=Integer.valueOf(d.getId());
        doctors.put(id,d);
        System.out.println(doctors.values());
    }

    public void removedBookedSlot(String slot,Doctor d){
        int id=Integer.valueOf(d.getId());
        d.removeSlot(slot);
        doctors.put(id,d);
    }
}
