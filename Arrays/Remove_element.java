package Arrays;

import java.util.Scanner;

public class Remove_element {
       public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        
                int arr[]= new int[n];
                for(int i =0;i<5;i++)
                {
                    arr[i]= sc.nextInt();
                }
                int position;
           position= sc.nextInt();
          for(int i = position;i<5;i++)
          {
                arr[i]=arr[i+1];
          }
            

            for(int a: arr)
            {
                System.out.print(a+" ");
            }
        }
}
