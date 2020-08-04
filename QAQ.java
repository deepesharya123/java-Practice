import java.util.Scanner;

public class QAQ {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		String s= in.nextLine();
		int sum=0;
		int i,tq=0,len = s.length();
		for(i=0;i<len;i++) {
			char c = s.charAt(i);
			if(c=='Q') {
				tq++;
			}
		}
		
		int counterofq=1;
		int lastq = s.lastIndexOf("Q");
		
		for(i=0;i<=lastq;i++) {
			char c = s.charAt(i);
			if(c=='Q') {
				int qhere=tq-counterofq;
				int j;
				for(j=i+1;j<=lastq;j++) {
					char c1 = s.charAt(j);
					int k=0;
					int Qk=0;
					if(c1=='A') {
						for(k=j+1;k<=lastq;k++) {
							if(s.charAt(k)=='Q') {
								Qk++;
							}
						}
						sum=sum+Qk;
					}

				}
				
				
				counterofq++;
			}
		}
		
		
		System.out.println(sum);
	}
		
}
