import java.util.Scanner;

public class DZYLovesHash {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int n = in.nextInt();
		
		int[] a = new int[300];
		int[] b = new int[n];
		
		int i;
		int nocon=0;
		for(i=0;i<n;i++) {
			b[i]=in.nextInt();
			int num = b[i];
			int mod = num%p;
			
			if(a[mod]==0)
				a[mod]=1;
			else 
				{
				nocon=1;
				System.out.println(i+1);
				break;
			}
			
		}
		if(nocon==0)
			System.out.println("-1");
		
		
	}
	
}
