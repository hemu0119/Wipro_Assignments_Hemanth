package Day2;
public class PasswordRetry {
	
		public static void main(String[] args) {
			
			String cusername = "Hemanth";
			String cpassword = "9999";
			
			String username = "Hemanth";
			String password = "9999";
			
			if (username == cusername && password == cpassword) {
				System.out.println("Login Succesful!");
			}
			else {
				System.out.println("Login Failure!");
			}
		}
	
}