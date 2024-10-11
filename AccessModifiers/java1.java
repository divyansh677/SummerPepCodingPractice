package AccessModifiers;

import java.io.*;
 public class java1 {
    public static void main(String[] args) {
        int a=5,b=0,c;
        try{
        c=a/b;
        System.out.println("Division of a and b is :"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception error");
        }
    }
}