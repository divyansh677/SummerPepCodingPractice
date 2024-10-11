package Methods;

import java.util.Scanner;

public class ReverseArrayorNum {
    public  int Reverse1(int num)
    {
            int number=num;
            int reverseNumber =0;
            while(number!=0)
            {
                int last = number%10;
                reverseNumber = reverseNumber*10+last;
                number/=10;
            }
            return reverseNumber;
    }
    public void Reverse1(int Array[])
    {
        int i =0;
        int j=Array.length-1;
        while(i<Array.length/2)
        {
            int temp = Array[i];
            Array[i]= Array[j];
            Array[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int num;
        int arr[] = new int[10];
        Scanner sc =new  Scanner(System.in);
        num = sc.nextInt();
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }       
         ReverseArrayorNum object = new ReverseArrayorNum();
        int result = object.Reverse1(num);
        System.out.println(result);
        object.Reverse1(arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }

    }
}


//  create the instance if class is not static 