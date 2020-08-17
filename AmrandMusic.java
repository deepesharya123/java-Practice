import java.util.Scanner;
import java.util.Vector;

public class AmrandMusic{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		
		int m = in.nextInt();
		int[] a = new int[n];
		int i;	
		int si=-1;
		for(i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		int s=a[0];
		for(i=0;i<n;i++) {
			if(s>=a[i]) {
				s=a[i];
				si=i;
			}
			
		}
		Vector v = new Vector();
		
		int ans=0;
		int run=1;
		int k=0;
		while(run!=0) {
			if(k<n) {
				
				if(v.size()==0) {
					
					if(m>=s) {
						ans++;
//						si=si+1;
						v.add(si);
						m=m-s;
					}else {
						run=0;
					}
					
				}
				else {
					s=200;
					int usi=-1;
				int j;
					for(j=0;j<n;j++) {
						int nu = a[j];
						if(!v.contains(j)) {
							if(s>=a[j]) {
								s=a[j];
								usi=j;
							}
						}
					}
					if(m>=s) {
				
					ans++;
					v.add(usi);
					m=m-s;
					}else {
						run=0;
					}
				}
				k++;
			}else {
				run=0;
			}
		}
		
		
		System.out.println(ans);
//		System.out.println(v);
		for(i=0;i<v.size();i++) {
			int nu = (int) v.get(i);
//			System.out.print(nu+" "+"asdF");
//			System.out.println();
			nu++;
			System.out.print(nu+" ");
//		System.out.println();
		}	
	
	
	}

}