package Day12;
import java.io.*;
import java.io.IOException;
 
public class File_Ex1{
public static void main(String[] args)
	{
 
		try {
			FileReader reader = new FileReader("Hemanth.txt");
            
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
			}
			reader.close();
			}
 
		 	catch(IOException e)
            {
            	System.out.println(e);
            }
	}
	}
 