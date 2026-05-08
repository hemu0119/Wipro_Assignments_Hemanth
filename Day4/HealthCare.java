package Day4;
class PatientRegistration{
	    private int id;
	    private String name;
	    private int age;
	    private String illness;

	    public void setId(int id) {
	        this.id=id;
	        }
	    public void setName(String name) {
	        this.name=name;
	        }
	    public void setAge(int age) {
	        this.age=age;
	        }
	    public void setIllness(String illness) {
	        this.illness = illness;
	        }
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public int getAge() { return age; }
	    public String getIllness() { return illness; }
	}
interface PatientService {
    public abstract void registerPatient(PatientRegistration patient);
    public abstract void patientsDetails();
}
class PatientServiceImpl implements PatientService {

    PatientRegistration[] patients =new PatientRegistration[10];
    int count=0;

    public void registerPatient(PatientRegistration patient) {
        if (count < patients.length) {
            patients[count]=patient;
            count++;
            System.out.println("Patient Registered: " + patient.getName());
        }
    }

    public void patientsDetails() {
        System.out.println("\nPatient Details\n");
        for (int i=0; i<count;i++) {
            PatientRegistration p = patients[i];
            System.out.println("ID: " + p.getId() +
                    ", Name: " + p.getName() +
                    ", Age: " + p.getAge() +
                    ", Illness: " + p.getIllness());
        }
    }
}
abstract class Doctor {
	String name;
	String specialization;
    abstract void diagnose(PatientRegistration patient);
}
class GeneralPhysician extends Doctor {

	public GeneralPhysician(String name) {
        this.name = name;
        this.specialization = "General Medicine";
    }
    public void diagnose(PatientRegistration patient) {
        System.out.println("Dr." + name + " treating " +
                patient.getName() + " for " + patient.getIllness());
    }
}
class Cardiologist extends Doctor {
	
    public Cardiologist(String name) {
    	this.name = name;
        this.specialization = "Cardiology";}

    public void diagnose(PatientRegistration patient) {
        if (patient.getIllness().toLowerCase().contains("heart")) {
            System.out.println("Dr." + name + " treating heart issue of " +
                    patient.getName());
        } else {
            System.out.println("Dr." + name + " suggests general physician for " +
                    patient.getName());
        }
    }
}

public class HealthCare {

	public static void main(String[] args) {
		PatientService s = new PatientServiceImpl();

        PatientRegistration p1 = new PatientRegistration();
        PatientRegistration p2 = new PatientRegistration();
        p1.setId(1);
        p1.setName("Raghav");
        p1.setAge(22);
        p1.setIllness("Fever");
        p2.setId(2);
        p2.setName("John");
        p2.setAge(30);
        p2.setIllness("Heart Disease");
        s.registerPatient(p1);
        s.registerPatient(p2);

        s.patientsDetails();

        Doctor d1 = new GeneralPhysician("Ramesh");
        Doctor d2 = new Cardiologist("Navin");

        System.out.println("\nDiagnosis\n");

        d1.diagnose(p1);
        d1.diagnose(p2);

        d2.diagnose(p1);
        d2.diagnose(p2);
	}

}