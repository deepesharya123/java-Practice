import java.util.Scanner;

public class NewPassword {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		char[] c = new char[26];
		int i;
		for(i=0;i<k;i++) {
			int nu = i+97;
			char ch =(char) nu;
			c[i]=ch;
//			System.out.println(ch);
		}
		
		int p =0;
		int cn =n;
		
		while(cn!=0) {
			if(p>=k) p-=k;
			int cp=p;
			System.out.print(c[cp]);
			p++;
			cn--;
		}
		
		
		
		
	}
	
}
