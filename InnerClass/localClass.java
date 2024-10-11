package InnerClass;

// abstract class outer{
//     public void meth1();
// }


class outer {
    
    void display()
    {
        class inner{
            int x =10;
            void innerDisplay()
            {
    System.out.println(x);
                
            }
        }
        
        
        inner obj = new inner();
    System.out.println(obj.x);
    }
    
}

public class localClass{
    public static void main(String args[])
    {
        outer obj = new outer();
        obj.display();
    }
}