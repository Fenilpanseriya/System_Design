import controllers.AppointmentController;
import controllers.authController;
import models.Doctor;
import models.Patient;
import repository.AppointmentRegistery;
import repository.DoctorRepo;
import repository.ObjectRegistery;
import repository.PatientRepo;
import services.AppointmentService;
import services.PatientService;
import services.DoctorService;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

/**
 * main
 */
public class Main {

    public static void main(String[] args) {

        ObjectRegistery.put("patientRepo",new PatientRepo());
        ObjectRegistery.put("doctorRepo", new DoctorRepo());
        ObjectRegistery.put("appointmentRegistery",new AppointmentRegistery());

        ObjectRegistery.put("patientService", new PatientService((PatientRepo)ObjectRegistery.get(("patientRepo"))));
        ObjectRegistery.put("doctorService", new DoctorService((DoctorRepo)ObjectRegistery.get(("doctorRepo"))));
        ObjectRegistery.put("appointmentService",new AppointmentService((AppointmentRegistery) ObjectRegistery.get("appointmentRegistery")));

        ObjectRegistery.put("authController",new authController((PatientService)ObjectRegistery.get("patientService"), (DoctorService)ObjectRegistery.get("doctorService")));
        ObjectRegistery.put("appointmentController",new AppointmentController((AppointmentService) ObjectRegistery.get("appointmentService"), (DoctorService) ObjectRegistery.get("doctorService")));

        Patient p=new Patient();
        p.setName("fenil panseriya");

        authController controller=(authController) ObjectRegistery.get("authController");
        controller.registerPatient(p);

        Doctor d=new Doctor();
        d.setName("Dr. Kaushik");
        d.setSpecialization("Cardiologist");
        controller.reegisterDoctor(d);

        Doctor d1=new Doctor();
        d1.setName("Dr. Sachin");
        d1.setSpecialization("Cardiologist");
        controller.reegisterDoctor(d1);

        AppointmentController appointmentController=(AppointmentController) ObjectRegistery.get("appointmentController");

        appointmentController.addSlot(LocalTime.of(9,0),LocalTime.of(10,0),d);
        appointmentController.addSlot(LocalTime.of(11,0),LocalTime.of(12,0),d);
        appointmentController.addSlot(LocalTime.of(14,0),LocalTime.of(15,0),d);
        appointmentController.addSlot(LocalTime.of(8,0),LocalTime.of(9,0),d1);
        appointmentController.addSlot(LocalTime.of(12,0),LocalTime.of(13,0),d1);

        System.out.println("Enter speciality of Doctor for check availability");
        Scanner sc=new Scanner(System.in);
        String speciality=sc.nextLine();

        List<List<String>> slots=appointmentController.earlyAvailableTime(speciality);
        System.out.println("slots are");
        System.out.println(slots);

        System.out.println("Enter doctor name");
        Scanner sca=new Scanner(System.in);
        String doctorName=sca.nextLine();

        int booikngId1= appointmentController.bookAppointment(LocalTime.of(9,0),p.getName(),doctorName);

        System.out.println("booking id is "+booikngId1);
        int booikngId2= appointmentController.bookAppointment(LocalTime.of(11,0),p.getName(),doctorName);

        System.out.println("booking id is "+booikngId2);

        slots=appointmentController.earlyAvailableTime(speciality);
        System.out.println("slots are......");
        System.out.println(slots);
        appointmentController.cancleBooking(booikngId2);


    }
}
