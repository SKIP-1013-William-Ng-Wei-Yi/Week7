package lecClass;

public class noteWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int j=1;
		int k;
		while (i<5)
		{
			System.out.println("i = " + i);
			
			i++;
		}
		
		do {
			System.out.println("j = "+j);
			j++;
	
		}while(j<5);
		
		for(k=1; k<5; k=k+1) {
			System.out.println("k = "+k);
		}
		
		
	}

}
