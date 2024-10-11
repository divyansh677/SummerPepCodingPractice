package Methods;

public class max_method {
    public static int max(int a,int b)
    {
            if(a>b)
            return a;
            else
            return b;
    }
    public static void main(String[] args) {
        int num1=12,num2=34;
        int result = (max(num1, num2));
        System.out.println(result);

    

    // static int max(int a,int b)
    // {
    //         if(a>b)
    //         return a;
    //         else
    //         return b;
    // }
    // public static void main(String[] args) {
    //     int num1=12,num2=34;
    //     int result = (max_method.max(num1, num2));
    //     System.out.println(result);

    
    }  
}

    



// static method can directly be ca