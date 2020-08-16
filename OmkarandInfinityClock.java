import java.util.Scanner;

public class OmkarandPassword {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t=  in.nextInt();
		int i;
		
		for(i=0;i<t;i++) {
			int n=in.nextInt();
			long k = in.nextLong();
			
			long[] a = new long[n];
			int j;
			for(j=0;j<n;j++)
				a[j]=in.nextLong();
			
			long h=k;
			if(h>3) {
				if(h%2==0) {
					h=2;
				}else {
					h=3;
				}
			}
			k=h;
			
			while(k!=0) {
				
				long d = a[0];
				int e=0;
				for(e=0;e<n;e++)
				{
				    
					if(d<a[e]) d=a[e];
				}
				for(e=0;e<n;e++)
				{
					a[e]=d-a[e];
				}
				k--;
			}
			
			
			for(j=0;j<n;j++)
				System.out.print(a[j]+" ");
			
			System.out.println();
		}
//		System.out.println("HE:LO");
		
		
		
	}
	
}
