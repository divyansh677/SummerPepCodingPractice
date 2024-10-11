package LambdaExpression;
@FunctionalInterface
interface test{
    void method1();
}


class uselambda{
    public void use( test y)
    {
        y.method1();
    }
}

class demo{
    void display()
    {
        uselambda ob = new uselambda();
        ob.use(()->{System.out.println("hello");});
    }
}
// class Demo{
//     int count1=0; // instance variable and can modify instance variable//
//     public void display()
//     {
//         int count =0;
//         test my = ()->{System.out.println("Hello How are you doing");};
//         my.method1();
    
//     }
// }


public class LambdaAsExpression {
    public static void main(String args[])
    {
        demo obj = new demo();
        obj.display();
       
    }
}
