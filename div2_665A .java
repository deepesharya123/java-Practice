import java.util.Scanner;

public class div2_665A {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int i;
		int[] res= new int[t];
		
		for(i=0;i<t;i++) {
			int n= in.nextInt();
			int k=in.nextInt();
			
			
			
			if(k<=n) {
				int dif= n-k;
				if(dif%2!=0) res[i]=1;
				else res[i]=0;
			}
			else {
				int id = n-k;
				res[i]=Math.abs(id);
				
				
			}
				
			
			
			
		}
		
		for(i=0;i<t;i++)
			System.out.println(res[i]);
		
	}
	
}
