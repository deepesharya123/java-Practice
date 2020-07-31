import java.util.Scanner;


public class FileName {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		in.nextLine();
		String s=  in.nextLine();
//		System.out.println(s);
		int[] q = new int[n];
		int k=0;
		int i,count=0;
		int tot=0;
		int sum=0;
		int l = s.length();
		for(i=0;i<l-2;i++) {
			char a= s.charAt(i);
			char b= s.charAt(i+1);
			char c= s.charAt(i+2);
			if(a=='x'&&b=='x'&&c=='x') {
				
				count++;
				
			}
			else {
				q[k]=count;
				k++;
				count=0;
			}
//			System.out.println(i+"i");
//			System.out.println(a+" "+b+" "+c);
		}
//		System.out.println(2+" "+q[0");
		for(i=0;i<k;i++) {
//			System.out.println(q[i]);
			tot=tot+q[i];
		}
		
		System.out.println(tot+count);
		
	}
	
}
//12
//xxxxxxxaxxxx