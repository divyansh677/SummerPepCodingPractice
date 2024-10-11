import java.util.*;
public class ArrayList
{
	public static void main(String[] args) {
	    ArrayList<Integer> number= new ArrayList<>(20);
        ArrayList<Integer> copy = new ArrayList<>(List.of(50,60,70,80,90));
        
        number.add(10);
        number.add(0,3);
        number.add(5);
        number.add(6);
        number.add(7);
        // number.addAll(1,copy);
        // number.add(5,90);
        System.out.println(number.contains(4));
        System.out.println(number.set(2,4));
        
        // Iterator<Integer> iter =  number.iterator();
        
        // while(iter.hasNext())
        // {
        //     System.out.println(iter.next());
            
        // }
        
        // number.forEach((x)->{
        //     System.out.println(x);
        // });
        
        // for(int i =0;i<number.size();i++)
        // {
        //     System.out.println(number.get(i));
        // }
        
        number.forEach(System.out::println);
        
	}
}
