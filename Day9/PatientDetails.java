package Day9;

import java.util.*;

public class PatientDetails {
    public static void main(String[] args) {

        ArrayList<String> patients = new ArrayList<>();

        patients.add("Ravi");
        patients.add("Anita");
        patients.add("Kiran");

        for (String p : patients) {
            System.out.println(p);
        }

        
        String search = "Anita";
        for (String p : patients) {
            if (p.equals(search)) {
                System.out.println("Found: " + p);
            }
        }
        patients.add("Raghu");
        for (String p : patients) {
            System.out.println(p);
        }
    }
}