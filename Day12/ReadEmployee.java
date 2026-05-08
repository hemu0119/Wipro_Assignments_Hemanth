package Day12;
import java.io.*;

public class ReadEmployee {
    public static void main(String[] args)
            throws Exception {  FileInputStream fis =
            new FileInputStream(
                    "employee.txt");

    ObjectInputStream ois =
            new ObjectInputStream(fis);
    	try {

    	    while(true){

    	        Employee e =
    	                (Employee) ois.readObject();

    	        System.out.println(
    	                e.id + " "
    	                        + e.name + " "
    	                        + e.salary);
    	    }

    	}

    	catch(EOFException e){

    	    System.out.println(
    	            "All Employees Read");
    	}
    }
}