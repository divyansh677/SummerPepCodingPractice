package Methods;
import java.util.*;
public class primeNumber{
    public static boolean prime(int num)
    {
        int count =0;
        //for(int i=2;i<num/2;i++)
        for(int i =2;i*i< num;i++)
        {
            if(num%i==0)
            {
                count++;

            }
           



        }

        if(count==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
     int number;
      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();
      if(prime(number)) System.out.println("The numebr is prime");
      else{
        System.out.println("the number is not prime");
      }

    }
}