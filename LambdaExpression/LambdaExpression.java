package LambdaExpression;
@FunctionalInterface
interface test{
    int add(int a,int b);
}

// class Demo{
//     public void display()
//     {
//         test my = ()->System.out.println("Hello How are you doing");
//         my.method1();
//     }
// }


public class LambdaExpression{
    public static void main(String args[])
    {
        // Demo obj = new Demo();
        // obj.display();
        test my = (a,b)-> a+b;
        System.out.println(my.add(2,5));
        
    }
}


