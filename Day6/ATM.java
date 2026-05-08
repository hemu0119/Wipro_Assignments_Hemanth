package Day6;

public class ATM {

	public static void main(String[] args) {
		int Pin=1234;
        int EnteredPin=4557;
        try {
        	System.out.println("Card Inserted");
            if(EnteredPin!=Pin){
            	throw new Exception("Invalid Pin");
            }
            System.out.println("Access Granted");
        }
        catch(Exception e){
        	System.out.println("Access Denied ");
        }
        finally {
        	System.out.println("Transaction Logged");
        }
	}

}