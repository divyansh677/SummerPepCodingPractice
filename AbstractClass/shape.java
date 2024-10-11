package AbstractClass;

abstract class shape1{
    abstract float perimeter();
    abstract float area();

}
class circle extends shape1 {
float radius;
circle(float radius)
{
this.radius = radius;
}
float pi = (float)Math.PI;
float perimeter()
{
    return pi*radius*2;
}
float area()
{
    return pi*radius*radius;
}

}
class Rectangle extends shape1 {
    float length;
    float breadth;
    Rectangle(float length,float breadth)
    {
    this.length = length;
    this.breadth = breadth;
    }
    float perimeter()
    {
        return 2*(length*breadth);
    }
    float area()
    {
        return (length*breadth);
    }
    
    }

public class shape {
    public static void main(String[] args) {
         circle cir = new circle(2.3f);
         System.err.println(cir.area());
         System.err.println( cir.perimeter());
         Rectangle rec = new Rectangle(2,3);
         rec.area();
         rec.perimeter();
         System.err.println( rec.perimeter());
         System.err.println( rec.area());
         shape1 sh;
// we can  create the reference of the abstract class but we can not create object of the reference class


    }
    
}
