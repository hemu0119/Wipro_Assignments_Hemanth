package Day11;
import java.io.*;

public class Buffer_ex {
    public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Hemanth.txt"));
            bw.write("Hi Everyone!");
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader("Hemanth.txt"));
                System.out.println(br.readLine());
                br.close();        
        }
    }