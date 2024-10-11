package InnerClass;

class outer
{
    static int x =10;
    int y =20;
    
    static class inner{
        // only static variable can be accessed
        void display(){
            System.out.println(x);
            // System.out.println(y); this is not static it will give error//
        }
    }
}


public class staticClass{
    public static void main(String args[])
    {
         // outer.inner obj = new outer.inner();
        // obj.display();
        new outer.inner().display();  //anoymous object;
    }
}