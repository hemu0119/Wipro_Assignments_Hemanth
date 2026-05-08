package Day5;
class Payments{
	public final void processPayment(double amt) {
		validatePayment(amt);
		Transaction(amt);
		System.out.println("Payment Success");
	}
	public void validatePayment(double amt) {
		System.out.println("Validating Payment of "+amt);
			
	}
	public void Transaction(double amt) {
		System.out.println("Transaction of "+amt+" is being processed");
			
	}
}
class CardPayment extends Payments{
	public void validatePayment(double amt) {
			System.out.println("Validating Payement of "+amt+" via OTP");
				
		}
}
public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments p=new CardPayment();
		p.processPayment(100000);

	}

}