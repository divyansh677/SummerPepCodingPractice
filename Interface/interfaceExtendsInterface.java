package Interface;



interface test {
    int X=10;
    void meth1();
    void meth2();
    default void meth5()
    {
        System.out.println("this is interface static meth5");
    }
}

interface test1 extends test
{
    void meth3();
    void meth4();
    
}

class classroom implements test1{
    public void meth1()
    {
        System.out.println("this is meth1");
    }
    public void meth2()
    {
        System.out.println("this is meth2");
    }
    public void meth3()
    {
        System.out.println("this is meth3");
    }
    public void meth4()
    {
        System.out.println("this is meth4");
    }
}


public class interfaceExtendsInterface{
    public static void main(String args[])
    {
        classroom obj = new classroom();
        obj.meth5();
        System.out.println(test1.X);
    }
}




