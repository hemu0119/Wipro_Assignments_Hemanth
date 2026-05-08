package Day9;
public class Main {
    public static void main(String[] args) {
        Hospital h = new Hospital();

        Patient p1 = new Patient(101, "Raghav");
        Patient p2 = new Patient(102, "Rahul");
        Patient p3 = new Patient(101, "Ram"); 

        h.registerPatient(p1);
        h.registerPatient(p2);
        h.registerPatient(p3);

        h.viewPatients();
    }
}