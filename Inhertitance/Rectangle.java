package Inhertitance;

class  Rectangle1{ 
    int length ;
    int breadth ;
   public Rectangle1()
   {
       breadth=length= 1;
   }
   public Rectangle1(int length,int breadth)
   {
       this.length=length;
       this.breadth = breadth;
       
   }
   
}

class Cuboid extends Rectangle1 {
 private int height;
 public Cuboid()
 {
     height = 1;
 }
 public Cuboid(int height)
 {
     this.height = height;
 }
 
 public Cuboid(int length,int breadth, int height)
 {
     super(length,breadth); // calling the super class constructor
     this.height = height;
 }
 
 public int volume ()
 {
    return length*breadth*height;
 }
}
public class Rectangle {
   public static void main(String[] args) {
       Cuboid obj1= new Cuboid();
       Cuboid obj2= new Cuboid(12);
       Cuboid obj3= new Cuboid(5,3,10);
      System.out.println(obj1.volume());
       System.out.println(obj2.volume());
       System.out.println(obj3.volume());
     

   }
}