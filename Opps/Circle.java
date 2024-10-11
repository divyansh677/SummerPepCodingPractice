package Opps;
class InnerCircle {
public int radius;
public double Area(){
    return Math.PI*radius*radius;
}
public double perimeter(){
    ret>>>urn 2*Math.PI*radius;
}
public double circumference(){
    return perimeter();
    
}
}
public class Circle {

    public static void main(String[] args) {
        InnerCircle object = new InnerCircle();
        object.radius = 23;
        System.out.println(object.Area());
        System.out.println(object.perimeter());
        System.out.println(object.circumference());
    }
    
}
