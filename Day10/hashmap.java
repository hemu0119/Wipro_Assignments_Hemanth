package Day10;
import java.util.*;
class Patient {
    int id;
    String name;
    int age;

    Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
    static void addPatient(HashMap<Integer, Patient> map, int id, String name, int age) {
        if (map.containsKey(id)) {
            System.out.println("\nPatient already exists!");
        } else {
            map.put(id, new Patient(id, name, age));
            System.out.println("\nPatient added.");
        }
    }
    static void updatePatient(HashMap<Integer, Patient> map, int id, String name, int age) {
        if (map.containsKey(id)) {
            map.put(id, new Patient(id, name, age));
            System.out.println("\nPatient details with id "+id+" are updated.");
        } else {
            System.out.println("\nPatient not found.");
        }
    }
    static void getPatient(HashMap<Integer, Patient> map, int id) {
        Patient p = map.get(id);
        if (p != null) {
            System.out.println("\nPatient Details:\n"+p);
        } else {
            System.out.println("\nPatient not found.");
        }
    }
    static void removePatient(HashMap<Integer, Patient> map, int id) {
        if (map.remove(id) != null) {
            System.out.println("\nPatient removed.");
        } else {
            System.out.println("\nPatient not found.");
        }
    }
    static void listPatients(HashMap<Integer, Patient> map) {
        if (map.isEmpty()) {
            System.out.println("\nNo patients available.");
        } else {
        	System.out.println("\nPatients Details:\n");
        	
            for (Patient p : map.values()) {
                System.out.println(p);
            }
        }
    }
    static void checkPatient(HashMap<Integer, Patient> map, int id) {
        if (map.containsKey(id)) {
            System.out.println("\nPatient exists.");
        } else {
            System.out.println("\nPatient does not exist.");
        }
    }
    static void countPatients(HashMap<Integer, Patient> map) {
        System.out.println("\nTotal patients: " + map.size());
    }

    static void clearAll(HashMap<Integer, Patient> map) {
        map.clear();
        System.out.println("\nAll records cleared.");
    }
}
public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer, Patient> patients = new HashMap<>();

        Patient.addPatient(patients, 1, "Hemu", 22);
        Patient.addPatient(patients, 2, "Jayanth", 25);
        Patient.addPatient(patients, 1, "Teja", 12);

        Patient.listPatients(patients);

        Patient.getPatient(patients, 1);

        Patient.updatePatient(patients, 1, "Hemu", 22);

        Patient.checkPatient(patients, 2);

        Patient.countPatients(patients);

        Patient.removePatient(patients, 2);
        Patient.countPatients(patients);

        Patient.listPatients(patients);

        Patient.clearAll(patients);
        Patient.listPatients(patients);

    }
}