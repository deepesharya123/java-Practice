import java.util.Scanner;
public class SubstringRemovalGame {
	
	void merge(int[] a,int l,int m,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		int i,j;
		for(i=0;i<n1;i++)
			left[i]=a[i+l];
		for(j=0;j<n2;j++)
			right[j]=a[j+m+1];
		
		i=0;
		j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(left[i]<right[j]) {
				a[k]=right[j];
				j++;
			}else {
				a[k]=left[i];
				i++;
			}
			k++;
		}
		
		while(i<n1) {
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
		}
		
		
	}
	
	void sort(int[] a,int l,int u) {
		if(l<u) {
			int m = l+u;
			m/=2;
			
			sort(a,l,m);
			sort(a,m+1,u);
			
			merge(a,l,m,u);
		}
	}
	
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int i;
		in.nextLine();
		for(i=0;i<t;i++) {
			String s = in.nextLine();
			
			int j=0;
			int l = s.length();
			int ans=0;
			int k=0;
			int[] one=new int[l];
			for(j=0;j<l;j++) {
				
				int h =0;
				int add=0;
				for(h=j;h<l;h++) {
//					System.out.println(h+" i am running for this");
					char a = s.charAt(h);
//					System.out.println(a+" is the " + h+" th character from 0 to n-1");
					if(a=='1' &&h!=l-1) {
//						System.out.println("AS");
						add++;
					}else if(a=='0'||(a=='1'&& h==l-1)) {
						if(a=='1') add++;
						one[k]=add;
//						System.out.println(one[k]+" "+h+" and the char is "+a);
						k++;
						j=h;
						break;
					}
				}
				
			}
			SubstringRemovalGame ob = new SubstringRemovalGame();
			
			ob.sort(one, 0, k-1);
			
			int sum=0;
			for(j=0;j<k;j++) {
				if(j%2!=0) one[j]=0;
				sum+=one[j];
			}
//			System.out.println();
			System.out.println(sum);
			
		}
		
	}
	
}
