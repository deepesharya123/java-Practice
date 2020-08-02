import java.util.Scanner;

class EhAbAnDCd {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int i;
		int[] a = new int[t];
		for(i=0;i<t;i++) {
			a[i]=in.nextInt();
		}
		for(i=0;i<t;i++) {
			int num = a[i];
			if(num%2==0) {
				num=num/2;
				System.out.println(num+" "+num);
			}else {
				num=num-1;
				System.out.println(1+" "+num);
			}
		}
		
		
	}
	
}
