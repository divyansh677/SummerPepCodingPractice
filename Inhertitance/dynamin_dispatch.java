class parent{
    void display()
    {
        System.out.println("hello");
    }
}
class child  extends parent{
    void display()
    {
        System.out.println("hello how are you ");
    }
}

public class dynamin_dispatch{
    public static void main (String args[])
    {
        parent obj1 = new parent();
        obj1.display();
        child obj2 = new child();
        obj2.display();
        parent obj3 = new child(); // method is called based on the object
        obj3.display();
    }
}

