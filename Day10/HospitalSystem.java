package Day10;
import java.util.*;
class Patients implements Comparable<Patients> {
    int id;
    String name;

    Patients(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Patients p) {
        return this.id - p.id;  
    }

    
}
public class HospitalSystem {

	public static void addPatient(TreeSet<Patients> patientSet, Patients p) {
        if (patientSet.add(p)) {
            System.out.println("Patient added");
        } else {
            System.out.println("Already registered");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Patients> patientSet = new TreeSet<>();

        
        for (int i = 0; i < 4; i++) {
            System.out.println("\nEnter details for patient " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            Patients p = new Patients(id, name);
            addPatient(patientSet, p);
        }

        System.out.println("\nRegistered Patients :");
        for (Patients p : patientSet) {
        	System.out.println(p.id + " - " + p.name);
        }

        sc.close();
    }
}