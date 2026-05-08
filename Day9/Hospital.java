package Day9;
import java.util.*;

class Hospital {
     HashSet<Patient> patients = new HashSet<>();

    public void registerPatient(Patient p) {
        if (patients.contains(p)) {
            System.out.println("Patient already registered (ID: " + p.getId() + ")");
        } else {
            patients.add(p);
            System.out.println("Patient added successfully");
        }
    }

    public void viewPatients() {
        System.out.println("\nRegistered Patients:");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
}