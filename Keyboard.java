import java.lang.*;
import java.util.*;

class Keyboard{
   	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the number you want to enter");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("The sum of two number is :"+c);		
	}
}