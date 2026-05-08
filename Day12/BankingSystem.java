package Day12;
import java.io.*;
import java.util.*;
public class BankingSystem{
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		AccDetails();
		System.out.print("Enter Account Number to Withdraw/Deposit: ");
        String n =sc.nextLine();
        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();
        System.out.print("Enter Amount : ");
        int amount = sc.nextInt();
        Transaction(n,choice,amount);
        sc.nextLine();
        System.out.println("Enter Account Number to view transaction History: ");
        String n1=sc.nextLine();
        ViewTransactions(n1);
        System.out.println();
        AccDetails();
	}
	public static void AccDetails() throws IOException {
		BufferedReader br =
		        new BufferedReader(
		                new FileReader("accounts.txt"));

		String line;
		System.out.println("Accounts Details : ");

		while((line = br.readLine()) != null){

		    String[] data = line.split(",");

	        
	        System.out.println("Account Number : " + data[0]);
	        
		        System.out.println("Name : " + data[1]);
		        System.out.println("Balance : " + data[2]);
		    }
		br.close();
	}
	public static void Transaction(String n,int choice,int amount) throws IOException {
		 File inputFile =new File("accounts.txt");
	        File tempFile =new File("temp.txt");
	        BufferedReader br =new BufferedReader(new FileReader(inputFile));
	        BufferedWriter bw =new BufferedWriter(new FileWriter(tempFile));
	        String line;
	        while((line = br.readLine()) != null){
	            String[] data =
	                    line.split(",");
	            String accNo = data[0];
	            String name = data[1];
	            int balance =Integer.parseInt(data[2]);

	            if(accNo.equals(n)){
	                if(choice == 1){
	                    balance +=amount;
	           FileWriter fw =new FileWriter("transactions_"+n+ ".txt",true);
	                    fw.write("Deposited : "+ amount+ "\n");
	                    fw.close();
	                    System.out.println("Amount Deposited");
	                }
	                else if(choice == 2){
	                    if(balance >= amount){
	                        balance =balance - amount;
	                 FileWriter fw =new FileWriter("transactions_"+n+ ".txt",true);
	                        fw.write(
	                                "Withdrawn : "+ amount+ "\n");
	                        fw.close();
	               System.out.println("Amount Withdrawn");
	                    } else {
	                        System.out.println("Insufficient Balance");
	                    }
	                }
	            }
	            bw.write(accNo + ","+ name + ","+ balance);
	            bw.newLine();
	        }

	        br.close();
	        bw.close();
	        inputFile.delete();
	        tempFile.renameTo(inputFile);

	        
	    }
	public static void ViewTransactions(String n1) throws IOException {
		BufferedReader br =
                new BufferedReader(
                        new FileReader(
                                "transactions_"
                                        + n1
                                        + ".txt"));
        String line;
        System.out.println("\nTransaction History");
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
  
	}
	
	}

