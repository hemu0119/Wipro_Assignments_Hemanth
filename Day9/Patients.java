package Day9;

import java.util.*;

public class Patients {

        int id;
        String name;

        Patients(int id,String name) {
            this.id = id;
            this.name=name;
        }

        
        public boolean equals(Object obj) {
            Patients p = (Patients) obj;   
            return this.id == p.id;    
        }

        
        public int hashCode() {
            return id; 
        }
        public static void addPatient(HashSet<Patients> patient, Patients p) {
            if (patient.add(p)) {
                System.out.println("Patient added");
            } else {
                System.out.println("Already registered");
            }
        }
    

    public static void main(String[] args) {

        HashSet<Patients> patient = new HashSet<>();

        Patients p1 = new Patients(101,"Raghav");
        Patients p2 = new Patients(102,"Ram");
        Patients p3 = new Patients(101,"Raghavan"); 

        addPatient(patient,p1);
        addPatient(patient,p2);
        addPatient(patient,p3);
        
        System.out.println("Patients: " + patient.size());
        
    }
}