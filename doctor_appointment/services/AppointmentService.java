package services;

import repository.AppointmentRegistery;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AppointmentService {
    private AppointmentRegistery appointmentRegistery;

    public AppointmentService(AppointmentRegistery registery){
        this.appointmentRegistery=registery;
    }

    public synchronized  int bookAppointment(String patientName, String doctorName, LocalTime time){
        List<List<String>> slots=appointmentRegistery.getSlots(LocalDate.now());
        String requestedSlot=""+time;
        if(slots != null){
            System.out.println("inside if");
            System.out.println(slots);
            System.out.println();
            for(int i=0;i< slots.size();i++){
                if(slots.get(i).get(3).equals(patientName) && slots.get(i).get(1).equals(requestedSlot)){
                    System.out.println("slot matched");
                    throw new Error("you can not book same time slot for appointment, you already booked "+requestedSlot);
                }
            }
        }
        return appointmentRegistery.put(""+time,doctorName,patientName);
    }

    public void cancleBooking(int bookingId){
        appointmentRegistery.cancleAppointment(""+bookingId);
    }


}
