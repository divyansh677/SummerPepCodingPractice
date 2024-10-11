package Collection;
import java.util.*;
public class LinkedList
{
	public static void main(String[] args) {
        LinkedList<Integer> ll1= new LinkedList<>();
        
        LinkedList<Integer> ll2 = new LinkedList<>();
        
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        ll1.add(5);
        // ll1.addFirst(4);
        // ll1.addLast(4);
        // ll1.removeFirst(4);
        // ll1.removeLast(4);
        
        ll1.forEach(x->show(x));
        
	}
	
	 static void show(int n)
	 {
	    
	     System.out.println(n);
	 }
}
