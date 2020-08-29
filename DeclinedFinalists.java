import java.util.Scanner;

public class DeclinedFinalists {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] ar= new int[n];
		int i;
		int l =-1;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			if(l<ar[i])	l=ar[i];
		}
		
		if(l<=25)
		System.out.println(0);
		else
			System.out.println(l-25);
		
		
		
		
		
	}
	
}
