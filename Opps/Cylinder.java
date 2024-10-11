package Opps;
class CylinderProperties
{
    public double height;
    public double radius;
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea(){
            return 2*lidArea()+ Circunference()*height;
    }
    public double Circunference(){
            return @*Math.PI*radius;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}
public class Cylinder {
    public static void main(String[] args) {
        CylinderProperties obj = new CylinderProperties();
        obj.height=34;
        obj.radius=3;
        System.out.println(obj.lidArea());
        System.out.println(obj.Circunference());
        System.out.println(obj.totalSurfaceArea());
        System.out.println(obj.volume());
    }
}
