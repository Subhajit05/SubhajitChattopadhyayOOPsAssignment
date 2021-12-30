package Service;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;


public class CredentialService {
	
	
	Scanner sc;
	
	
	public void generatePassword(){
	
		String []CapLetters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q"
				,"R", "S","T","U", "V", "W", "X","Y", "Z"};
		String []SmallLetters = {"a","b","c","d","e","f", "g", "h", "i","j","k","l","m","n","o",
				"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		String []num = {"0","1","2","3","4","5","6","7","8","9","10"};
		String []SpecialChar = {"*", "_","$","~", "#", "@"};
		
		System.out.println("Enter the length of the password");
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		
		System.out.println("Enter how many capital characters should be there");
		
		Scanner sc1 = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		System.out.println("Enter how many small characters should be there");
		
		Scanner sc2 = new Scanner(System.in);
		
		int n2 = sc2.nextInt();
		
		System.out.println("Enter how many numbers characters should be there");
		
		Scanner sc3 = new Scanner(System.in);
		
		int n3 = sc3.nextInt();	
		
		System.out.println("Enter how many special characters should be there");
		
		Scanner sc4 = new Scanner(System.in);
		
		int n4 = sc4.nextInt();
		
		String [] pwd = new String[length];
		String [] caps = new String[n1];
		String [] small = new String [n2];
		String []nos = new String[n3];
		String []spec =new String[n4];
		
		
		
		Random r = new Random(); 
		
		if (n1+n2+n3 > length) {
			System.out.println("dont exceed total length of password");
		}
			else {
				
		for(int i = 0; i < n1; i++) {
			
			int c = r.nextInt(CapLetters.length);
			 caps [i] =  CapLetters[c]; 
				}
		
		for(int j =0; j < n2;j++) {
			
			int s = r.nextInt(SmallLetters.length);
			small[j] = SmallLetters[s];
		}
		
		for(int k =0 ; k< n3; k++) {	
		 
			int x = r.nextInt(nos.length); 
			nos[k] = num[x];
		}
		
		
		for(int m =0 ; m < n4; m++) {
			
			int y = r.nextInt(spec.length);
			
			spec[m] = SpecialChar[y];
			
			}
		System.out.println("Your password is follows:"); 
		PrintArray(caps); PrintArray(nos); PrintArray(small);PrintArray(spec);
		}
	
		
			
			
			
	}
			
	
		
	public void PrintArray(String []pq) {
		
		for(int i = 0; i < pq.length; i++) {
		System.out.print(pq[i]);	
		}
	}	
		
		
		

		
	public void generateEmailAddress(String fn, String ln ) {
	
		System.out.println("Indicate your department" 
				+"\nSelect 1: Technical"
				+"\nSelect 2: Admin"
				+"\nSelect 3: Human Resource"
				+"\nSelect 4: Legal");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String dept = null;
		switch(input){
			case 1: dept = "tech"; break;
			case 2: dept = "admn"; break;
			case 3: dept = "hr"; break;
			case 4: dept = "lagal"; break;
			default: System.out.println("Wrong option selected");
		}
		String pwd = fn+ln+"@"+dept+"."+"abc.com";	
		System.out.println("Your email is;" + " " + pwd);	
		
		
		
	}
		
	
	
	}

	
	

