package Arrays;

import java.util.Scanner;

public class Reverse_copying {
           public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        
                int arr[]= new int[n];
                for(int i =0;i<n;i++)
                {
                    arr[i]= sc.nextInt();
                }

        int copying_Array[] = new int[2*n]; // to increase the size of the array point A to new created array and make NULL

        int reverse =copying_Array.length-1;
        for(int i =0;i<n;i++)
        {
            copying_Array[reverse]=arr[i];
            reverse--;
        }
for(int a : copying_Array)
{
    System.out.print(a+" ");
            }
        
    }
}
