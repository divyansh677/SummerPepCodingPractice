package Loops;
import java.util.*;
public class A_P {
    public static void main(String args[])
    {
        int a, r,n;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        r=sc.nextInt();
        n=sc.nextInt();
        int term=a;
        for(int i =0;i<n;i++)
        {
            System.out.println(term);
            term*=r;
        }
    }
}
