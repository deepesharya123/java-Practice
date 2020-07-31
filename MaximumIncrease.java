import java.util.*;

public class MaximumIncrease {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] a = new int[n];
		int i;
		int lar=1;
		int ans=0;
		Vector l = new Vector();
		for(i=0;i<n;i++) {
			int num = in.nextInt();
			a[i]=num;
			if(i!=0) {
				int y = a[i-1];
				if(num>y) {
//					System.out.println(y+" "+num);
					lar++;
					if(ans<lar) ans= lar;
//					int nv=(int) l.indexOf(lar);
//					System.out.println(nv);
				}
				else {
//					System.out.println(lar);

					if(ans<lar) ans= lar;
				lar=1;
				}
			}
			
		}
		
		if(ans==0) ans=1;
		System.out.println(ans);
		
		
	}

}
