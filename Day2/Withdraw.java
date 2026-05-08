package Day2;

public class Withdraw{

	public static void main(String[] args) {
           int balance=10000;
           int withdrawal_amt=5000;
           if(withdrawal_amt<=balance) {
        	   System.out.println("Withdrawal Successful");
           }
           else {
        	   System.out.println("Insufficient Balance");
           }
	}

}