import java.util.Scanner;

public class Eleven {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
//		0 1 2 3 4 5 6 7 
//		O O O o O o o O
//		0 1 1 2 3 5 8 13
		int []fib= new int[30];
		int n = in.nextInt();
		int i;
		fib[0]=0;
		fib[1]=1;
		fib[2]=1;
		i=2;
		while(fib[i]<1000) {
			fib[i+1]=fib[i]+fib[i-1];
			i++;
		}
		
		String s = "";
		i=0;
		for(i=0;i<n;i++) {
			int num =0;
		int j;
			for(j=0;j<30;j++) {
				if(i+1==fib[j])
					num=1;
					
			}
			if(i<=2) num=1;
			
			if(num==1)
				s=s.concat("O");
			else 
				s=s.concat("o");
		}
		
		System.out.println(s);
	}
	
}
