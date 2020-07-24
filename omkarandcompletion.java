import java.util.Scanner;

public class omkarCompletion {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int i ;
		int sum=0;
		int[] q= new int[t];
		for(i=0;i<t;i++) {
			q[i]= in.nextInt();
			sum=sum+q[i];
		}
		
		int[] res = new int[sum];
		for(i=0;i<sum;i++) {
			if(i<335) {
				if(i==0) res[i] =2;
				else if(i==1) res[i] =3;
				else if(i==2) res[i] =4;
				else if(i==3) res[i] =8;
				else if(i==4) res[i] =9;
				else {
					if(i%2!=0) {
						res[i]=res[3]+(3*(i-3));
					}else {
						res[i]=res[4]+(3*(i-4));
					}
				}
			}
			else if(i>=335&&i<667) {
//				res[168] = 500
				res[i]=res[i-335+3];
			}else if(i>=667) {
				res[i]=res[i-335];
			}
			
		
		}
		int k=0;
		for(i=0;i<t;i++) {
			int num = q[i];
			while(num!=0) {
				res[k]=1;				// this line is doing all the work 
					// the line just above will not present then it will make the array having a[x]+a[y]!=a[z] but here x,y, and z can not be same at all.
				
				System.out.print(res[k]+" ");
				k++;
				num--;
			}
			System.out.println();
		}
		
	
	}
	

}
