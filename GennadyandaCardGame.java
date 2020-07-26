import java.util.Scanner;

public class GennadyandaCardGame {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s0 = in.nextLine();
		
		String[] s = new String[5];
		int o;
		for(o=0;o<1;o++)
			s[o]=in.nextLine();
		
		
		
//		System.out.println(s[0].length());
		
//		in.nextLine();
//		String s1 = in.nextLine();  //in.nextLine();
//		String s2 = in.nextLine(); //in.nextLine();
//		String s3 = in.nextLine(); //in.nextLine();
//		String s4 = in.nextLine(); //in.nextLine();
//		String s5 = in.nextLine(); //in.nextLine();
////		
//		System.out.println(s1+" "+s0);
		
		char c1 = s0.charAt(0);
		char c2 = s0.charAt(1);
//System.out.println(c1+" "+c2);
		char a,b,c,d,e,f,g,h,i,j,k,l;
//		
			a = s[0].charAt(0);
			b = s[0].charAt(1);
			c = s[0].charAt(3);
			d = s[0].charAt(4);
			e = s[0].charAt(6);
			f = s[0].charAt(7);
			g = s[0].charAt(9);
			h = s[0].charAt(10);
			i = s[0].charAt(12);
			j = s[0].charAt(13);
			
//			System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+"good");
			
			
			
			int yes=0;
			
			if((a==c1||g==c1||c==c1||i==c1||e==c1)||(f==c2||b==c2||h==c2||d==c2||j==c2)) {
				yes=1;
			}
			
			if(yes==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		
		
	}

}
