import java.util.Scanner;

public class BadTriangle {

	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		int[] res=new int[3*t];
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int[] ar = new int[n];
			
			int j;
			for(j=0;j<n;j++)
				ar[j]=in.nextInt();
			
			int no=0;
			int x=0,y=0,z=0;
			
			j=0;
//			for(j=0;j<n-2;j++) {
				int a = ar[j];
				int b = ar[j+1];
				int c = ar[n-1];
				
				if(((a+b)<=c)||((a+c)<=b)||((b+c)<=a)) {
					x=1;
					y=2;
					z=n;
					no=1;
				}
				
//			}
			
			if(no==0)
				System.out.println("-1");
			else
				System.out.println(x+" "+y+" "+z);
			
		}
		
		
	}
	
}
