package Opps;
class  Rectange{
    private int length;
    private int breadth;
    // public int length;
    // public int breadth;
    public void setLength(int l)
    {
        if(l>=0)
        length = l;
        else{
            length=0;
        }
    }
    public void setBreadt(int b)
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

    public int Area(){
                return getBreadth()*getLength();
    }
    public int perimeter(){
                return  2*(length*breadth);
    }
    public boolean isSqaure()
    {
            // if(length==breadth)
            // return true;
            // else
            // return false;
            return  length==breadth;
    }
    

}
 class Rectange1 {
    public static void main(String[] args) {
        Rectange object = new Rectange();
        // object.length = 12;
        // object.breadth = 12;
        
        System.out.println(object.Area());
        System.out.println(object.perimeter());
        System.out.println(object.isSqaure());
        
    }
    
}
