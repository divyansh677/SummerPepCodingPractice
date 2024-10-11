package InnerClass;
interface test {
    void display();
}


class outer{
    void dis()
    {
        test my = new test()
        {
            public void display()
            {
            System.out.println(" This is ");
            }
            
        };
    my.display();
    }
}

public class Anoyomous {
    public static void main(String args[])
    {
        outer obj = new outer();
        obj.dis();
    }
}
