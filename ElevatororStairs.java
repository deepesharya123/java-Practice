import java.util.Scanner;
public class ElevatororStairs{

     public static void main(String []args){
         
         Scanner in = new Scanner(System.in);
         int x = in.nextInt();
         int y = in.nextInt();
         int z = in.nextInt();
         int t1 = in.nextInt();
         int t2 = in.nextInt();
         int t3 = in.nextInt();
         
         int s= Math.abs(x-y);
         s=s*t1;
         
         int e = (Math.abs(z-x))*t2;
         e=e+(t3+t3);
         e=e+(Math.abs(x-y)*t2);
         e=e+t3;
         
//         System.out.println(s+" " +e);
         
         if(e<=s)
        	 System.out.println("YES");
         else
        	 System.out.println("NO");
         
         
     }
}