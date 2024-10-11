import java.lang.*;
import java.util.Scanner;
class Practice{
    public static boolean isPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count=0;
        int number=2;
        while(count<=num)
        {
            if(isPrime(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}