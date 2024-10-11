
class circle1{
   float Radius;
  public circle1()
  {
     Radius = 0;

  }
  public circle1(float radius)
  {
    System.out.println("INside circle1 COnst");
     Radius = radius;
  }
  public double Area(){
      System.out.println("Area method called");
return  Math.PI*Radius*Radius;

  }
  public double Perimeter()
  { 
return  2*Math.PI*Radius;

  }


 

}
class circle2 extends circle1 {
 float height;

 public circle2()
 {
     height = 0;

 }
 public circle2(float radius,float Height)
 {
    Radius = radius;
    height = Height;
    System.out.println("INside circle2 COnst");
 }
 public double volume()
 {
     return Area()*height;
 }
 
}


public class circle
{
 public static void main(String[] args) {
  circle1 cp = new circle1(23);
   System.out.println(cp.Area());
   cp.Perimeter();
   circle2 cp2 = new circle2(2,3);
   double  value1 = cp2.volume();
   System.out.println(value1);
   System.out.println(cp2.Area());
   
   
 }
}
