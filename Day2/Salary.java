package Day2;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] emp_salaries = {25000, 30000, 28000, 35000, 40000};

       int increment=1000;
       for(int i=0;i<5;i++) {
    	   emp_salaries[i]+=increment;
    	   System.out.println("Updated Employee Salaries : "+emp_salaries[i]);
       }
	}

}