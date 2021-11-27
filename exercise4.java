package lecClass;
import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generate a random number to be guessed not to be over 11
		
	    int number = (int)(Math.random() * 11);
	    int i,j=-1;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("This is the randon numbering system !");
	    
	    while (j != number)
	    {
	    	System.out.println("Enter Number 1 - 11 :");
	    	i = sc.nextInt();
	    
	    
	    if (i==number)
	    {
	    	System.out.println("Congrats the value in same!");
	    }
	    
	    else if (i>=number)
	    {
	    	System.out.println("The value you entered is too large !");
	    }
	    
	    else
	    {
	    	System.out.println("The value you entered is too small !");
	    }
	   }
	}

}
