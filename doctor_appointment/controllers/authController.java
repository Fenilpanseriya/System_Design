package controllers;
import models.Doctor;
import models.Patient;
import services.DoctorService;
import services.PatientService;

public class authController {
    private PatientService patientService;
    private DoctorService doctorService;
    public authController(PatientService patientService,DoctorService doctorService){
        this.patientService = patientService;
        this.doctorService = doctorService;
    }
    
    public void registerPatient(Patient p ) {
        patientService.loginPatient(p);
    }
    public void reegisterDoctor(Doctor d){
        doctorService.loginDoctor(d);
    }
}
