package repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppointmentRegistery {
    private HashMap<LocalDate,List<List<String>>> appointments=new HashMap<>();
    private int counter=0;
    public int put(String time, String doctorName, String patientName){
        LocalDate date=LocalDate.now();
        if(appointments.get(date)==null){
            appointments.put(date,new ArrayList<>());
        }
        List<String> appointment=new ArrayList<String>();
        appointment.add(""+counter);
        appointment.add(time);
        appointment.add(doctorName);
        appointment.add(patientName);
        counter++;
        appointments.get(date).add(appointment);
        return counter-1;
    }

    public List<List<String>> getSlots(LocalDate date){
        return appointments.get(date);
    }

    public void cancleAppointment(String bookingId){
        List<List<String>> appointment=appointments.get(LocalDate.now());
        for(int i=0;i<appointment.size();i++){
            if(appointment.get(i).get(0).equals(bookingId)){
                appointment.remove(i);
                System.out.println("cancle booking successfully of booking id "+bookingId);
                System.out.println("now bookings are...");
                System.out.println(appointment);
                return;
            }
        }
        throw new  Error("booking id not found. please enter correct  booking id");
    }
}
