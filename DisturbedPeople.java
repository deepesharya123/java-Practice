import java.util.Scanner;

public class DisturbedPeople {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar= new int[n];
		
		int i;
		for(i=0;i<n;i++)
			ar[i]=in.nextInt();
		
		int  ans=0;
		int[] dis=new int[n];
		int k=0;
		for(i=1;i<n-1;i++) {
			int a = ar[i-1];
			int b = ar[i];
			int c = ar[i+1];
			
			if(a==1&&b==0&&c==1) {
//				dis[k]=i;
//				System.out.println(i);
				ans++;
//				k++;
				ar[i+1]=0;
			}
			
		}
		
		System.out.println(ans);
		
		
	}
	
}
