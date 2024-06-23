package controllers;

import models.Doctor;
import services.AppointmentService;
import services.DoctorService;

import java.time.LocalTime;
import java.util.List;

public class AppointmentController {
    private AppointmentService service;
    private DoctorService doctorService;
    public AppointmentController(AppointmentService service,DoctorService doctorService){
        this.service=service;
        this.doctorService=doctorService;
    }
    public int bookAppointment(LocalTime time,String patientName,String doctorName){
        int bookingId=service.bookAppointment(patientName,doctorName,time);
        if(bookingId>=0){
            doctorService.removedBookedSlot(doctorName,time,time.plusHours(1));
        }
        return bookingId;
    }

    public List<String> getSlotsBySpeciality(String speciality){
        return doctorService.getSlotsBySpeciality(speciality);
    }

    public void addSlot(LocalTime start, LocalTime end, Doctor d){
        doctorService.addSlot(start,end,d);
    }

    public void cancleBooking(int bookingId){
        service.cancleBooking(bookingId);
    }

    public List<List<String>> earlyAvailableTime(String speciality){
        return doctorService.earlyTimeAvailableStrategy(speciality);
    }
}
