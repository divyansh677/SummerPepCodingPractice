package Opps;
class Rectange{
    private int length;
    private int breadth;
    public void setLength(int l)
    {
        if(l>=0)
        length = l;
        else{
            length=0;
        }
    }
    public void setBreadth(int b)
    {
        if(b>=0)
        breadth = b;
        else{
            breadth=0;
        }
    }
    public int getLength()
    {
        return length;
    }
    public int getBreadth()
    {
        return breadth;
    }

    public Rectange(){
        length=1;
        breadth=1;
    }
    public Rectange(int l,int b)
    {
        setLength(l);
        setBreadth(b);
        
    }
    public Rectange(int Side){
            
    setLength(Side);
    }
    public int Area()
    {
       return length*breadth; 
    }
    public int perimeter()
    {
        return 2*(length*breadth);
    }
    public boolean isSquare()
    {
            return length==breadth;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Rectange obj = new Rectange(12,23);
        System.out.println(obj.Area());

        
    }
}



