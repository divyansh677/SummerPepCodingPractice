import java.util.*;
public class Main
{
	public static void main(String[] args) {
//  code for  Iterator 
		// Collection<Integer> number = new ArrayList<>(); // interface collection does not have index methods
		// number.add(1);
		// number.add(2);
		// number.add(3);
		// number.add(4);
		// number.add(5);
		// Iterator<Integer> iterator = number.iterator();
		
		// while(iterator.hasNext())
		// {
		// 	Integer number1 = iterator.next();
		// 	System.out.println(number1);
		// }

	    int a[] = new int[10];
	    a = new int[]{1,2};
		Collection<Integer> number = new ArrayList<>();
		Collection<Integer> copy = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
	number.add(1);
	number.add(2);
	number.add(3);
	number.add(4);
	
	 for(Integer i : number)
	 {
	     System.out.println(i);
	 }
	 
// 	 for(int i=0;i<3;i++)
// 	 {
// 	     int num = sc.nextInt();
// 	     copy.add(num);
// 	 }
	 
// 	 number.addAll(copy);
// number.remove(copy);

// number.removeAll(copy);
// number.retainAll(copy);

	 for(Integer i : number)
	 {
	     System.out.println(i);
	 }
// 	  System.out.println(copy.isEmpty());
// 	  System.out.println(number.isEmpty());
	  System.out.println(number.contains(3));
	 
	 
	 
	}
}

//  toAarray 
// 
 