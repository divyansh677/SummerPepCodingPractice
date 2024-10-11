package Collection;

import java.util.*;
class Point implements Comparable{
    int x;
    int y;
    public Point(int x,int y)
    {
        this.x= x;
        this.y= y;
    }
    public String toString()
    {
        return "x="+x+"y="+y;
    }
    
    public int compareTo(Object b)
    {
        Point other = (Point)b;
        if(this.x>other.x)
        {
            return 1;
        }
        else if (this.x<other.x)
        {
            return -1;
        }
        else{
            if(this.y>other.y)
            {
                return 1;
            }
            else{
                return -1;
            }
        }
    }
    
    
    
}
public class TreeSet
{
	public static void main(String[] args) {
	  
	 TreeSet<Point> ts = new TreeSet<>();
	 
	 ts.add(new Point(1,1));
	 ts.add(new Point(3,4));
	 ts.add(new Point(6,6));
	 ts.add(new Point(2,7));
	 
	 System.out.println(ts);
	 
	 
}}
//shorted and unique // 
