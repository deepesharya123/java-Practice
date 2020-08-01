import java.util.Scanner;

public class TwoRegularPolygons {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] res= new int[t];
		
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			
			
			int d = n/m;
			int cn = d*m;
			
			if(cn==n) {
				res[i]=1;
			}
			
			
			
		}
		
		for(i=0;i<t;i++) {
			if(res[i]==1) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
	}
	
}
