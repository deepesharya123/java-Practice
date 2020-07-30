import java.util.Scanner;

public class AntonandDigits {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int k2 = in.nextInt();
		int k3 = in.nextInt();
		int k5 = in.nextInt();
		int k6 = in.nextInt();
		
		
		int sum=0;
		if(k2==0) {
			System.out.println("0");
		}else {
			int min = k2;
			if(min>k5) {
				min = k5;
			}
			if(min>k6) {
				min = k6;
			}
			int num = 256*min;
			sum=sum+num;
			k5=k5-min;
			k2=k2-min;
			k6=k6-min;
			
			if(k2==0) {
				System.out.println(sum);
			}else {
				int mo = k2;
				if(mo>k3) {
					mo = k3;
				}
				
				int j = 32*mo;
				sum=sum+j;
				
				System.out.println(sum);
				
				
			}
			
			
			
			
			
			
		}
		
	
	
	}

}
