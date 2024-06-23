package services;

import Strategy.DisplayDoctorStrategy;
import models.Doctor;
import repository.DoctorRepo;

import java.time.LocalTime;
import java.util.*;

public class DoctorService implements DisplayDoctorStrategy {
    DoctorRepo repo;
    public DoctorService(DoctorRepo repo){
        this.repo = repo;
    }
    public void loginDoctor(Doctor d){
        Doctor doctor=repo.save(d);
        System.out.println(doctor);
    }
    public List<String> getSlotsBySpeciality(String speciality){
        return repo.getSlotsBySpeciality(speciality);
    }
    public void addSlot(LocalTime start,LocalTime end,Doctor d){
        repo.addSlot(start,end,d);
    }

    public void removedBookedSlot(String name,LocalTime start,LocalTime end){
        Doctor d=repo.getDoctorByName(name);
        repo.removedBookedSlot(start+"-"+end,d);
    }

    @Override
    public List<List<String>> earlyTimeAvailableStrategy(String speciality) {
        List<String> doctors=this.getSlotsBySpeciality(speciality);
        List<List<String>> timeslotsWithDoctor=new ArrayList<>();
        for (int i=0;i<doctors.size();i++){
            timeslotsWithDoctor.add(Arrays.stream(doctors.get(i).split("->")).toList());//[["Dr kartik","9:00-10:00"]]
        }
        timeslotsWithDoctor.sort(Comparator.comparing(list -> list.get(1)));// sort according to second element which is available time;
        return timeslotsWithDoctor;
    }

    @Override
    public void doctorRatingStrategy(String speciality) {

    }
}
