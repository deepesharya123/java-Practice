import java.util.Scanner;

public class DeletefromtheLeft {

	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = in.nextLine();
		
		char[] cs  = s.toCharArray();
		char[] ct = t.toCharArray();
		
		int i;
		
		char[] sc = new char[s.length()];
		char[] tc = new char[t.length()];
		
		int h = s.length()-1;
		for(i=0;i<s.length();i++) {
			sc[h-i] = cs[i];
		}
		h=t.length()-1;
		for(i=0;i<t.length();i++) {
			tc[h-i] = ct[i];
		}
		
		int min = Math.min(s.length(), t.length());
		
		int k=0;
		for(i=0;i<min;i++) {
			char a =sc[i];
			char b = tc[i];
			
			if(a==b) {
				k=k+2;
			}else {
				break;
			}
		}
		
		int res=s.length()+t.length();
		res=res-k;
		
		System.out.println(res);
		
		
		
	}
}
