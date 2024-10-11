import java.lang.*;
import java.util.*;

class Bitwise{
 	public static void main(String args[])
	{
		// int x=-0b1010;
		// int y;
		// y=x>>1;
		// System.out.println(String.format("%s",Integer.toBinaryString(x)));
		// System.out.println(String.format("%32s",Integer.toBinaryString(y)));
		
	
		int x=-0b1010;
		int y;
		y=~x;
		System.out.println(String.format("%s",Integer.toBinaryString(x)));
		System.out.println(String.format("%32s",Integer.toBinaryString(y)));
		System.out.println(y);	
}

}