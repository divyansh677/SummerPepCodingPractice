package Inhertitance;
class parent {
    public parent()
    {
System.out.println("Non param of parent ");
    }
    public parent(int x)
    {
System.out.println("param of parent "+x);
    }


}
class child extends parent {
    public child()
    {
System.out.println("Non param of child ");
    }
    public child(int x)
    {
System.out.println("param of child"+x);
    }
    
    public child(int x,int y )
    {
        super(x); // super is uused to call the parent constructors
System.out.println("2 param of child");
    }
    


}
public class param_and_non_param_const {
    public static void main(String[] args) {
        child obj = new child();
        child obj1 = new child(3, 67);

    }
}



// constructors are executed in the top to bottom approach 