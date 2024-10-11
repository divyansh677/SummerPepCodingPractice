package Methods;
import java.util.*;
public class Area_methodOverloading {
    public static double Area(double length,double Breadth)
    {
        return length*Breadth;
    }
    public static double Area(double radius)
    {
        return Math.PI*radius*radius;
    }
    public static double Area(double side1 ,double side2,double height)
    {
            return 0.5*(side1+side2)*height;
    }
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      double length,Breadth,radius,side1,side2,height;
      length = sc.nextDouble();
      Breadth = sc.nextDouble();
      radius= sc.nextDouble();
      side1= sc.nextDouble();
      side2= sc.nextDouble();
      height= sc.nextDouble();
      double result1 = Area(length, Breadth);
      double result2= Area(radius);
      double result3 = Area(side1, side2, height);
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);


    }
}
