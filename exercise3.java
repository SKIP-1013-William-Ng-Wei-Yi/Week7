package lecClass;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare dua variable x =0, y=1. Selagi y lebih kecil dan sama dgn 10, tambah x dgn y. 
		//kemudian tambah y dgn 5. print x.
		
		int x=0;
		int y=1;
		int z=1;
		while (y <=20) {
			System.out.println("y = "+y);
			x=x+y;
			y=y+5;
			System.out.println("x = "+x);
			System.out.println("Looping = "+z);
			z++;
		}
		
		do {
			System.out.println("y = "+y);
			x=x+y;
			y=y+5;
			System.out.println("x = "+x);
			System.out.println("Looping = "+z);
			z++;
		}while(y<=20);
		
		
		 for (y=1;y<=20;)
	        {
	            System.out.println("y ="+y);
	            x=x+y;
	              y=y+5;
	              System.out.println("x ="+x);  
	              System.out.println("z ="+z);
	              z++;
	              y++;
	        }
		
	}

}
