package Day12;
import java.io.*;
import java.util.*;
class Employee
        implements Serializable {

    int id;
    String name;
    double salary;
    Employee(int id,
             String name,
             double salary){

        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class EmployeeSystem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee e1 =
                new Employee(
                        101,
                        "Hemanth",
                        50000);
       Employee e2=new Employee(102,"Jayanth",10000);
        FileOutputStream fos =
                new FileOutputStream(
                        "employee.txt");

        ObjectOutputStream oos =
                new ObjectOutputStream(fos);

        oos.writeObject(e1);
       oos.writeObject(e2);
        oos.close();
        fos.close();

        System.out.println(
                "Employee Object Saved");
	}

}