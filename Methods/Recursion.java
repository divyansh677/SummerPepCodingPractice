package Methods;

public class Recursion {
    public static void fun1(int a)
    {
        if(a>0)
        {
            System.out.println(a);
            fun1(a-1);
        }
        
    }
    public static void fun2(int a)
    {
        if(a>0)
        {
            fun2(a-1);
            System.out.println(a);
        }
        
    }
    public static void main(String[] args) {
        fun1(3);
        fun2(3);
    }
    
}
