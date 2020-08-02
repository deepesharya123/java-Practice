import java.util.Scanner;

class Hotelier {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		
		String s= in.nextLine();
		
		int len = s.length();
			
		int[] res = new int[10];
		int i;
		
		for(i=0;i<len;i++) {
			
			char c = s.charAt(i);
			int j=0;
			if(c=='L') {
				for(j=0;j<10;j++) {
					if(res[j]<=0) {
						res[j]++;
						break;
					}
				}
			}
			else if(c=='R') {
				for(j=9;j>=0;j--) {
					if(res[j]<=0) {
						res[j]++;
						break;
					}
				}
			}
			else {
				int num = c-48;
				res[num]=0;
			}
			
		}
		
		for(i=0;i<10;i++) {
			System.out.print(res[i]);
		}
		
			
		
	}
	
	
}
