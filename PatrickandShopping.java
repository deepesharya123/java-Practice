import java.util.Scanner;

public class PatrickandShopping {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int d2 = in.nextInt();
		int d3 = in.nextInt();
		int sumodD= d1+d2;
		sumodD = 2*sumodD;
		int l = d1;
		if(l<d2) l= d2;
		int s= d1;
		if(s>d2) s=d2;
		
		int totalDistance = 0;
		totalDistance = s;
		
		int comp1 = 0;
		int comp2 = 0;
		int comp3 = 0;
		comp1 = s+2*d3+ s;
		comp2 =  s+s+ (2*l);
		comp3 = d1+d2+d3;
		
		if(comp1<comp2&&comp1<comp3) {
			System.out.println(comp1);
		}
		else if(comp2<comp1&&comp2<comp3){
			System.out.println(comp2);
		}
		else {
			System.out.println(comp3);
		}
		
		
		
	}

}
