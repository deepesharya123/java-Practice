import java.util.Scanner;

public class SplittinginTeams {

	public static void main(String argsp[]) {
		Scanner in  = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] a = new int[n];
		
		int i;
		int c1=0,c2=0;
		for(i=0;i<n;i++)
		{			a[i]=in.nextInt();
		if(a[i]==1) {
			c1++;
		}else {
			c2++;
		}
		}
		
		if(c1<=c2) {
			System.out.println(c1);
		}else {
			
			int dif=c1-c2;
			// 10 5
			int ans=c2;
			int d = dif/3;
			ans=ans+d;
			System.out.println(ans);
			
			
			
			
			
		}
		
		

		
		
		
		
	}
	
}
