package Opps;
class CylinderProperties{
    private double  radius;
    private double height;
    public CylinderProperties()
    {
        radius=1;
        height=1;

    }
    public CylinderProperties(double height,double radius)
    {
        setHeight(height);
        setRadius(radius);
    }
    public CylinderProperties(double radius)
    {
        this.radius = radius;
    }
    public void setHeight(double height) {
        if(height>=0)
        this.height = height;
        else
        this.height = 0;
    }
    public void setRadius(double radius){
        if (radius>=0)
        this.radius = radius;
        else
        this.radius = 0;

    }
    public void setDimensions(double height,double radius)
    {
        this.height=height;
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }

 // can Add Area  totalSurfaceArea CurvedSurfaceArea //

}
public class Cylinder1 {
    
    
}






// for private constructors you can create the objects within the class 