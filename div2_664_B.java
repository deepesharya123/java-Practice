import java.util.*;

public class div2_664_B {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int  n= in.nextInt();
		int  m = in.nextInt();
		int  sx = in.nextInt();
		int  sy = in.nextInt();
		
		int  i,j;	
		int lx = sx-1;
		int ly = sy-1;
		System.out.println(sx+" "+sy);
//		System.out.println(lx+" "+sy);
		int[] p = new int[lx];
		while(lx>=1) {
			p[lx-1]=lx;
			System.out.println(lx+" "+sy);
			lx--;
		}
		
		int one=1;
		int kp=1,kn=0,ko=1;
		int c=1;
		int conlx=0;
		while(one<=n) {
//			int comp = p[conlx];
			if(one<=sx) {
				if(ko!=sy)
				System.out.println(one+" "+ko);
				
			}
			else {
				System.out.println(one+" "+ko);
			}
			c++;
			if(kp>0) {
				ko++;
			}
			if(kn>0) {
				ko--;
			}
			if(ko>m||ko<=0) {
				one++;
				
				int cd =c/m;
				ko=m;
				kp=0;
				kn=1;
				
				if(cd%2==0) {
					ko=1;
					kp=1;
					kn=0;
				}
			}
		}
		
		
		
		
		
	}
	
}
