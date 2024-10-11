package Methods;

public class Variable_argument_Demo {
    //                   Show(int [] x) this will allow only arr or null
    public static void show(int ...x)
    {
        for(int i :x)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        show();
        show(23,34 ,64);
        show(new int [] {1,2,3,4,5,6,7,8}); // this is the anomous array that does not have any reference and created in the heap  used and destroyed...
    }
}
