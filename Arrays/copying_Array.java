package Arrays;

import java.util.Scanner;

public class copying_Array {
          public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        
                int arr[]= new int[n];
                for(int i =0;i<n;i++)
                {
                    arr[i]= sc.nextInt();
                }

        int copying_Array[] = new int[n];
        for(int i =0;i<n;i++)
        {
            copying_Array[i]=arr[i];
        }
for(int a : copying_Array)
{
    System.out.print(a+" ");
            }
        
    }
}