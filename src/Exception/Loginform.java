package Exception;
import java.util.Scanner;

public class Loginform {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String isEmail= "admin@gmail.com";
		String isPass ="admin@123";
		
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter password");
		String pass = sc.next(); 
		
		if(isEmail.equals(email) && isPass.equals(pass)) {
			System.out.println("User login successfully");
		}
		else {
			throw new TestLogin("Invalid credentials");
		}
		
		
	}
}
