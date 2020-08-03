import java.util.*;

public class HonestCoach {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int i;
		int[] res=new int[t];
		int resi=0;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int[] a = new int[n];
			int j;
			for(j=0;j<n;j++)
				a[j]=in.nextInt();
			int k=0;
			int dif=Math.abs(a[0]-a[1]);
			for(j=0;j<n;j++) {
				for(k=0;k<n;k++) {
					if(j!=k) {
					if(dif>Math.abs(a[j]-a[k])) {
						dif=Math.abs(a[j]-a[k]);
					}
					}
					
					if(dif==0)
						break;		
				}
			}
			res[i]=dif;	
		}
		for(i=0;i<t;i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
