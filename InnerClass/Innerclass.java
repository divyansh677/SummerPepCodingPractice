package InnerClass;


class outer{
    int x =10;
    class inner{
         final static int y=30; // inside innerclass final can only be static // 
          int y=30;  
        void innerDisplay()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }
    
   void outerdisplay()
   {
    inner innerobj = new inner();
    innerobj.innerDisplay();
    System.out.println(inner.y);
    System.out.println(x);
   }
}

public class innerclass{
    public static void main(String args[])
    {
        outer obj = new outer();
        obj.outerdisplay();
        
        outer.inner obj1= new outer().new inner();
        obj1.innerDisplay();
    }
}