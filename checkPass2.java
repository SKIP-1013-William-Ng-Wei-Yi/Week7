package selfProgramming;
import java.util.Scanner;

public class passwordCheck2 {
	public final static int PASSWORD_LENGTH = 8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please create a password with below condition.\n"
		+"1. Must at least eight characters\n"
		+"2. Consists only letters and digits\n"
		+"3. Must contain at least two digits\n"
		+"Key in here : ");
		String pass = sc.nextLine();
		
		if(pass_Valid(pass)) {
			System.out.print("Password is valid ! : "+pass);
		}
		else {
			System.out.println("You entered a invalid password !");
		}
	}
		public static boolean pass_Valid(String password) {
			
			if (password.length() < PASSWORD_LENGTH) return false;
			
			int charCount=0;
			int numCount=0;
			
			for(int i=0; i<password.length(); i++) {
				char ch = password.charAt(i);
				
				if(isNumeric(ch)) numCount++;
				else if (isLetter(ch)) charCount++;
				else return false;
			}
			return (charCount >= 2 && numCount >=2);
		}
		public static boolean isLetter(char ch) {
			ch = Character.toUpperCase(ch);
			return (ch>='A'&&ch<='Z');
		}
		public static boolean isNumeric (char ch) {
			return (ch>='0'&&ch<='9');
		}
	}
