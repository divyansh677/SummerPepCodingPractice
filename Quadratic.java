import java.lang.*;
import java.util.*;

class Quadratic{
 	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		double d= Math.pow(b,2)-4*a*c;
		if(d<0)
		{
			System.out.println("Roots are imagenery");
		}
		else if(d==0){
			int r1=-b/2;
			int r2=-b/2;

			System.out.println("Roots are Real and equals" +r1+" "+r2 );

		}
		else{
		double r1=(-b+Math.sqrt(d))/(2*a);	
		double r2=(-b-Math.sqrt(d))/(2*a);	
		System.out.println("Roots are " +r1+" "+r2 );	
	
	}
}

}