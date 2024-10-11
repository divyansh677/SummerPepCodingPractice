import java.lang.*;
import java.util.*;

class Name{
   	public static void main(String args[])
	{
		System.out.println("Enter you name : ");
		Scanner name = new Scanner(System.in);
		String f_name;
		// f_name =name.next();//
		f_name= name.nextLine();
		System.out.println("Your name is : "+ f_name);
	}
}