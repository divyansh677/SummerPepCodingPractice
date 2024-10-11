class parent{
    parent()
    {
        System.out.println("This is the parents Constructors");
    }
    parent (int x)
    {
        
        System.out.println("This is Paremitrised Constructors "+x);
    }
}

class child extends parent{
    child()
    {
        System.out.println("This is child Constructors");
    }
    child(int y)
    {
        
        System.out.println("This is the child - param Constructors"+y);
    }
    child(int x,int y)
    {
        super(x);
        System.out.println("The value of " + x +" and "+" y "+ y +" ");
    }
}


public class demo2{
    public static void main(String args[])
    {
        child object = new child(5,4);
    }
}


    
}
