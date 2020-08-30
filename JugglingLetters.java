import java.util.Scanner;

public class JugglingLetters {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int i;
		int[] res=new int[t];
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			String[] s = new String[n];
			
			in.nextLine();
			int j;
			int[] ar = new int[27];
			for(j=0;j<n;j++) {
				s[j]=in.nextLine();
				int h=0;
				int l = s[j].length();
				for(h=0;h<l;h++) {
					char c= s[j].charAt(h);
					int inde= c-97;
					ar[inde]++;
				}
			}
			
			boolean yes=true;
			for(j=0;j<26;j++) {
				int nu =ar[j];
				if(nu!=0&&nu%n!=0) {
					yes=false;
					break;
				}
				
			}
			if(yes==true)
			res[i]=1;
			else
				res[i]=0;
			
			
			
		}
		
		for(i=0;i<t;i++)
		{		if(res[i]==1)
				System.out.println("YES");
			else
				System.out.println("NO");
	}
		
	}
	
}
