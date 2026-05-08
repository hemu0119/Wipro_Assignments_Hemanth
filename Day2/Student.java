package Day2;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int marks=98;
      if(marks>90) {
    	  System.out.println("Grade A+");
      }
      else if(marks>80 && marks<=90) {
    	  System.out.println("Grade A");
      }
      else if(marks>=70 && marks<=80) {
    	  System.out.println("Grade B+");
      }
      else if(marks>=60) {
    	  System.out.println("Grade B");
      }
      else if(marks>=50) {
    	  System.out.println("Grade C");
      }
      else {
    	  System.out.println("Fail");
      }
	}

}