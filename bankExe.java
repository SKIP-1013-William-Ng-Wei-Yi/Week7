package lecClass;
import java.util.Scanner;

public class bankExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String upass;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome by banking System !");
		System.out.println("Please keyin your name : ");
		sc.next();
		System.out.print("Key in your password : ");
		upass = sc.next();
		
		if (upass.equals("abc123"))
		{
			System.out.println("Access Granted !");
		}
		else{
		do
		{
			if(upass != "abc123")
			System.out.println("Access Denied ! Wrong password !");
			i++;
			System.out.println("Error Counter = "+i);
			System.out.println("Key in your password agian : ");
			upass = sc.next();
		}while(i<3);
		
			System.out.println("Sorry Card error!");
		}
	}
}
