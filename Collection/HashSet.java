package Collection;

import java.util.*;
public class HashSet
{
	public static void main(String[] args) {
    
        HashSet<Integer> hs = new HashSet<>(20,0.23f);
    
    hs.add(10);
    hs.add(20);
    hs.add(20);
    hs.add(40);
    
    Iterator<Integer> it = hs.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
    
}}
