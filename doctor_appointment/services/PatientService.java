package services;

import models.Patient;
import repository.PatientRepo;

public class PatientService {
    PatientRepo repo;
    public PatientService(PatientRepo repo){
        this.repo = repo;
    }
    public void loginPatient(Patient p){
        Patient patient=repo.save(p);
        System.out.println(patient);
    }
}
