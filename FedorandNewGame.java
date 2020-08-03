import java.util.Scanner;

public class FedorandNewGame {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		int m=in.nextInt();
		int k=in.nextInt();
		int i;
		int[] a = new int[m+1];
		for(i=0;i<m+1;i++) {
			int dec =in.nextInt();
			a[i]=dec;
		}
		int ans=0;
		int comp = a[m];
		String cp = Integer.toBinaryString(comp);
		int cplen = cp.length();
//		System.out.println(cp);
		for(i=0;i<m;i++) {
			int dec= a[i];
			String bin = Integer.toBinaryString(dec);
			int binlen = bin.length();
			 {
				int l = binlen;
				if(l<cplen) l=cplen;
				int diflocal=0;
				int ind=l-1;
				// binlen =3, cpplen=5; ind=4
				int dif=0;
				int lendif=Math.abs(binlen-cplen);
//				System.out.println(bin+" "+cp);
				while(ind>=0) {
					char c1;
					char c2;
					
					if(binlen<l) {
						if(ind<lendif) {
							c1='0';
						}
						else{
							c1=bin.charAt(ind-lendif);
						}
					}else {
						c1=bin.charAt(ind);
					}
					
					if(cplen<l) {
						if(ind>=lendif) {
							c2=cp.charAt(ind-lendif);
						}else {
							c2='0';
						}
					}else {
						c2=cp.charAt(ind);
					}
					
//						System.out.println(c1+" "+c2);
		
//					if((c1!=c2)&&((c1==1&&c2==0)||(c1==0&&c2==1))) {
//						dif++;
//						System.out.println(c1+" "+c2);
//						
//					}
					if((c1=='1'&&c2=='0')||(c1=='0'&&c2=='1')) {
						dif++;
					}
						
					ind--;
				}
				if(dif<=k) {
//					System.out.println(dif);
					ans++;

				}	
				
					
			}
		
		}
		
		System.out.println(ans);
		
	}
	
}
