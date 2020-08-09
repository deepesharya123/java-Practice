import java.util.Scanner;

public class suborays{
	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		int[] a= new int[t];
		
		int i;
		for(i=0;i<t;i++) {
			a[i]=in.nextInt();
		}
		
		for(i=0;i<t;i++) {
			int j = a[i];
			int k=0;
			for(k=1;k<=j;k++)
				System.out.print(k+" ");
			
			
			
			System.out.println();
			
		}
		
		
	}	
}
