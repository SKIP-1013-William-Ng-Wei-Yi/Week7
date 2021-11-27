package lecClass;
import java.util.Scanner;
public class passLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String pass1;
		String pass2;
		char ch;
		
		System.out.println("Create your password with below rules ");
		System.out.println("Password must have 8 characters and combination of letters and numbers");
		System.out.println("Enter here : ");
		pass1 = sc.next();
		for (int i=0; i<pass1.length(); i++) {
			ch=pass1.charAt(i);
			System.out.println(i+" "+ch);
			
		}
	}

}
