package Day9;
import java.util.LinkedList;

public class PatientsList {
    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<>();
        l.add("Raghu");
        l.add("Anita");
        l.add("Ram");

        
        System.out.println("Patients List: " + l);
       
        l.addFirst("Rajesh");
        System.out.println("Patients List: " + l);
        
        System.out.println("First: " + l.getFirst());
        l.removeLast();
        System.out.println("Patients List: " + l);
        
        System.out.println("Last: " + l.getLast());
    }
}