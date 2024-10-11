import java.lang.*;
import java.util.*;

class Radix{
   	public static void main(String args[])
	{
		System.out.println("Enter the number in the Binary form : ");
		Scanner sc = new Scanner(System.in);
		sc.useRadix(2);
		int x = sc.nextInt();
		System.out.println("The num is : " + x);	
	}
}