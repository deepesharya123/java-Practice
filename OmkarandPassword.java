import java.util.Scanner;

public class OmkarandPassword {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t=  in.nextInt();
		int i;
		int[] res = new int[t];
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int[] a = new int[n];
			int j;
			int sam=0;
			for(j=0;j<n;j++) {
				a[j]=in.nextInt();
				if(j>0&&a[j]==a[j-1]) sam++;
			}
			
			
//			System.out.println(sam);
			if(n!=2) {
			if(sam==n-1)
				res[i]=n;
			else 
				res[i]=1;
			
			}else if(n==2){
				int q=a[0];
				int w=a[1];
				if(q==w) res[i]=2;
				else res[i]=1;
			}
			
		}
	
		for(i=0;i<t;i++)
			System.out.println(res[i]);
		
		
	}
	
}
