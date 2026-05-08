package Day12;
import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class serializable_ex {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student(101, "Raghav");

        FileOutputStream fs = new FileOutputStream("student.txt");
        ObjectOutputStream ob = new ObjectOutputStream(fs);

        ob.writeObject(s1);

        ob.close();
        fs.close();
    }
}