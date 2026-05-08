package Day12;
import java.util.*;
import java.io.*;
public class HospitalSystem {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(true) {
System.out.println("\n1)New Patient\n2)View Patients\n3)ViewReport\n4)Exit\n");
int choice=sc.nextInt();
	if(choice==1){
System.out.print("Enter Patient ID : ");
int id = sc.nextInt();

sc.nextLine();

System.out.print("Enter Patient Name : ");
String name = sc.nextLine();
System.out.print("Enter Patient Age : ");
int age = sc.nextInt();

sc.nextLine();
System.out.print("Enter Disease : ");
String disease = sc.nextLine();
AddPatient(id,name,age,disease);
GenerateReport(id,name,age,disease);
	}
	else if(choice==2) {
		ViewPatients();
	}
	else if(choice==3) {
		System.out.println("\nEnter patient id to view report: ");
		int n=sc.nextInt();
		ViewReport(n);
	}
	else {
		break;
	}

}


	}
	public static void AddPatient(int id, String name, int age, String disease) throws IOException {
		 FileWriter fw =new FileWriter("patients.txt",true);
	        fw.write(id + ","+ name + ","+age+","
	                + disease + "\n");
	        fw.close();
	        System.out.println(
	                "Patient Record Saved");
	}
	public static void GenerateReport(int id, String name,int age, String disease) throws IOException {
		String doctor = "";
        String medicine = "";

        if(disease.equalsIgnoreCase("Fever")){
            doctor = "Sharma";
            medicine = "Paracetamol";
        }
        else if(disease.equalsIgnoreCase("Cold")){
            doctor = "Ramesh";
            medicine = "Cetirizine";
        }
        else if(disease.equalsIgnoreCase("Diabetes")){
            doctor = "Kiran";
            medicine = "Insulin";
        }
        else{
            doctor = "General Doctor";
            medicine = "General Medicine";
        }
        FileWriter fw =new FileWriter("report_"+ id+ ".txt",true);
        fw.write("Patient ID : "+ id + "\n");

        fw.write("Patient Name : "+ name + "\n");
        fw.write("Disease : "+ disease + "\n");
        fw.write("Doctor : "+ doctor + "\n");
        fw.write("Medicine : "+ medicine + "\n");
        fw.close();
        System.out.println(
                "Medical Report Generated");
	}
	public static void ViewPatients() throws IOException {
		BufferedReader br =
		        new BufferedReader(
		                new FileReader(
		                        "patients.txt"));

		String line;

		while((line = br.readLine()) != null){

		    System.out.println(line);
		}

		br.close();
	}
	public static void ViewReport(int n) throws IOException {
		BufferedReader br =new BufferedReader(new FileReader("report_"+n+ ".txt"));
        String line;
        System.out.println(
                "\nMedical Report\n");
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
	}
}
	