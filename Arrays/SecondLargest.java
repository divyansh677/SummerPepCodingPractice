package Arrays;
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
int n;
Scanner sc= new Scanner(System.in);
n = sc.nextInt();

        int arr[]= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int max=arr[0];
        int secondMax=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
            secondMax= max;
            max=arr[i];
            }
             else if(arr[i]>secondMax)
             {
                secondMax=arr[i];

             }
             
            }
            System.out.println(secondMax);
    }
    
}
