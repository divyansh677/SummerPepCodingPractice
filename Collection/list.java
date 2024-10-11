package Collection;

import  java.util.*; 
public class list
{
	public static void main(String[] args) {
// 	Collection<Integer> number = new ArrayList<>(); // interface collection does not have index methods
	List<Integer> number = new ArrayList<>(); 
        
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(3);
        number.add(3);
        number.add(3);
        // number.add(2,4);
        // number.remove(1); // index 1 element will be deleted 
        // System.out.println(number.get(1));
        // System.out.println(number.subList(1,4));
        // System.out.println(number.indexOf(3));
        // System.out.println(number.lastIndexOf(3));
        // number.set(2,8);
         Iterator<Integer> iterator = number.listIterator();
        //  Iterator<Integer> iterator = number.listIterator(2);
        while(iterator.hasNext())
        {
            Integer num = iterator.next();
            System.out.println(num);
        }
        
//         for(Integer i : number){
//             System.out.println(i);
//         }
	}
}
