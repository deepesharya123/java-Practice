import java.util.Scanner;

public class TwoRivalStudents {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i=0;
		for(i=0;i<t;i++) {

			int n = in.nextInt();
			int x = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			
			int ca=a;
			int cb=b;
			ca=Math.min(a, b);
			cb=Math.max(a, b);
			a=ca;
			b=cb;
			int ans1 = Math.abs(ca-cb);
			int ans2=0;
			int disfromstart = a-1;
			int disfromlast = n-b;
			if(x>0) {

				if(disfromstart>=x) {
					a=a-x;
					x=0;
				}else {
					ca=a;
					ca=a-1;
					x=x-ca;
					a=1;
				}
				
				if(x>0) {
					b=b+x;
					if(b>n) {
						b=n;
					}
				}
			}
//			System.out.println(a+" "+b);
			ans2 = Math.abs(a-b);
			
			int res=Math.max(ans2, ans1);
	
			System.out.println(res);
				
		}
		
		
	}
	
}
