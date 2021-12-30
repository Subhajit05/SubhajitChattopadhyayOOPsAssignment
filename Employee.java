package Service;
import Service.CredentialService.*;
import java.util.Scanner;

public class Employee {
	
   String fn,ln;
	Scanner sc1,sc2;
	
	
	
	
	
	public static void main(String[]args) {
		
		System.out.println("Type your first name:");
		Scanner sc1 = new Scanner(System.in);
		String fn = sc1.next();
		
		System.out.println("Type your last name:");
		Scanner sc2 = new Scanner(System.in);
		String ln = sc2.next();
		
		CredentialService obj = new CredentialService();
		
		System.out.println("Dear" + " " + fn + " "+ "you credentials are follows");
		obj.generateEmailAddress(fn, ln);
		obj.generatePassword();
		
		
		
		 
		
		
	}
	
   
}
