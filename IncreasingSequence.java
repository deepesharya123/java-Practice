import java.util.Scanner;
public class IncreasingSequence {

	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		
		int n = in.nextInt();
		int d = in.nextInt();
		
		
		int[] ar= new int[n];
		int i=0;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		int c=0;
		
		int ans=0;
		int res=0;
		for(i=0;i<n-1;i++) {
			int a = ar[i];
			int b = ar[i+1];
			int add=1;
			if(b>a) {
//				continue;
			}else {
				int dif = a-b;
//				 3 1		c=2 
//				 3 2		c=1
			
				ans= dif/d;
				ans++;
				int num = b+ans*d;
				ar[i+1]=num;
				b=num;
				res=res+ans;
//				System.out.println(ans);
				
				ans=0;
			}
			
//			res=add+res;
//			System.out.println(a+" "+b);
		}

		System.out.println(res);
		
		
		
	}
	
}
