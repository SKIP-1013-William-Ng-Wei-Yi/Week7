package selfProgramming;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age");
        Scanner age= new Scanner(System.in);

        int userage= age.nextInt();
        if(userage<10){
            for(int i = 0;i<3;i++){
                System.out.println(userage+ "is too young");
                System.out.println("Enter your age");
                int userage1= age.nextInt();
            }
        }

       else{
            System.out.println("welcome");
       }
   
	}

}
