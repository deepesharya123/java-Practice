import java.util.Scanner;

public class SerejaandMugs {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int i;
		int sum=0;
		int[] a= new int[n];
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
			sum=sum+a[i];
		}
		int s= a[0];
		for(i=0;i<n;i++) {
			if(s<a[i])
				s=a[i];
		}
		
		sum=sum-s;
//		System.out.println(sum);
		
		if(sum<=m) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
		
	
	}
	
	
}
