package repository;

import java.util.HashMap;
import java.util.Map;

import models.Patient;

public class PatientRepo {
    private Map<Integer,Patient> patients=new HashMap<>();
    private int counter=0;

    public Patient  save(Patient p){
        p.setId(""+counter);
        patients.put(counter, p);
        counter++;
        System.out.println("register successfully.....");
        return p;
    }
    public Patient getPatient(int id){
        return patients.get(id);
    }
}
