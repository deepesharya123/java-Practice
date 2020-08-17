import java.util.Scanner;

public class Squae {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int a,b,c,d;
			
			int x=0;
			
			a=in.nextInt();
			b=in.nextInt();
			c=in.nextInt();
			d=in.nextInt();
		
			int[] ar = new int[4];
			
			if(a<b) {
				ar[0]=a;
				ar[1]=b;
			}else {
				ar[0]=b;
				ar[1]=a;
			}
			
			if(c<d) {
				ar[2]=c;
				ar[3]=d;
			}else {
				ar[2]=d;
				ar[3]=c;
			}
			
			if(ar[0]+ar[2]==ar[3]&&ar[3]==ar[1]) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			
		}
		
			
		
	}
	
}
