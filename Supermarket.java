import java.util.Scanner;

public class Supermarket {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
;
		double[] d= new double[n];
		int i;
		for(i=0;i<n;i++) {
			int a =in.nextInt();
			int b = in.nextInt();
			
			double z = (double)a/(double)b;
//			System.out.println(z);
			z=z*m;
			d[i]=z;
			
		}
		
		double min = d[0];
		for(i=0;i<n;i++)
			if(min>d[i]) min=d[i];
		
		
//		System.out.println(min);
		System.out.format("%.9f",min);
		
		
		
	}
	
}
