import java.util.Scanner;

public class FarRelativesBirthdayCake {

	public static void main(String args[]) {
		Scanner in  = new Scanner(System.in);
		
		
		int n= in.nextInt();
		String[] s = new String[n];
		
		for(int i=0;i<n;i++) {
			s[i]="";
		}
		
		
		in.nextLine();
		for(int i=0;i<n;i++) {
			String comp="";
			
			comp=in.nextLine();
//			System.out.println(comp);
			s[i]=s[i].concat(comp);
			
		}
		
		int i,j;
		int ans=0;
		for(i=0;i<n;i++) {
			int nz=0;
			for(j=0;j<n;j++) {
				char c = s[i].charAt(j);
				if(c=='C'){
					nz++;
				}
				
			}
//			System.out.println(nz);
			if(nz>1) {

//				System.out.println(nz+" here nz>1");
				int add = nz*(nz-1);
//				System.out.println(add);
				add=add/2;
//				System.out.println(add);
				ans=add+ans;
//				System.out.println(ans+"ASDF");
			}
			
		}
//		System.out.println(ans);
		for(i=0;i<n;i++) {
			int nz=0;
			for(j=0;j<n;j++) {
				char c = s[j].charAt(i);
				if(c=='C'){
					nz++;
				}
				
			}
			if(nz>1) {
				int add = nz*(nz-1);
				add=add/2;
				ans=add+ans;
			}
			
		}
		
		System.out.println(ans);
		
	}

}
