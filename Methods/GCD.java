package Methods;

import java.util.Scanner;

public class GCD {
    public static int  gcd1(int num1,int num2 )
    {
        int min = num1>num2?num2:num1;
        int gcd=1;
        for(int i=1;i<min;i++){
            if(num1%i==0 && num2%i==0)
            {
                gcd= i;
            }
        }
        return gcd;
    }
    public static void gcd2(int num1,int num2)
    {
        while(num1>0 && num2>0)
        {
            if(num1>num2) num1=num1%num2;
            else num2 = num2%num1;
            if(num1==0)  System.out.println(num2);
            else  System.out.println(num1);
        }
    }

public static int  gcd3(int num1,int num2)
{
    while(num1!=num2)
    {
        if(num1>num2) num1=num1-num2;
        else num2 = num2-num1;
        
    }
    return num1;
}

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        num1 =sc.nextInt();
        num2 =sc.nextInt();
        int result = gcd1(num1, num2);
        System.out.println(result);
        
}
}
