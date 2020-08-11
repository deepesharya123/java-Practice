import java.util.Scanner;

public class MaximumSquare {
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		MaximumSquare ob = new MaximumSquare();

		int[] res= new int[t];
		
		int i=0;
		int k =0;
		
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int[] a = new int[n];
			
			
			int j ;
			for(j=0;j<n;j++)
				a[j]=in.nextInt();
			
			
			int r=0;
			for(r=1;r<n+1;r++) {
				int ans = 0;
				for(j=0;j<n;j++) {
					int nu = a[j];
					if(nu>=r) {
						ans++;
					}
				}
//				System.out.println(r+" "+ans);
				if(ans>=r) {
					res[i]=r;
				}
				
			}
			
		}
		
		for(i=0;i<t;i++)
			System.out.println(res[i]);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
