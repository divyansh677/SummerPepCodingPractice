package AbstractClass;

import java.lang.*;

abstract class Super{
 public Super()
 {
    System.out.println("In SuperClass Constructors");
 }
    public void meth1()
    {
        System.out.println("in method 1");
    }
    abstract public void meth2();
 
}

class Sub extends Super{
//to make it concrete Override all the concrete methods\
@Override
public void meth2()
{
    System.out.println("In sub class method 2");
}
}


class AbstractClass{
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.meth1();
        obj.meth2();
    }
}


// Abstract class used To Define the Standard//