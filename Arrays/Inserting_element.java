package Arrays;
import java.util.*;
public class Inserting_element {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        
                int arr[]= new int[n];
                for(int i =0;i<5;i++)
                {
                    arr[i]= sc.nextInt();
                }
           int number,position;
           number = sc.nextInt();
           position= sc.nextInt();
           for(int i=4; i>=position;i--)
           {
arr[i+1]=arr[i];
           }
           arr[position]=number;
            

            for(int a: arr)
            {
                System.out.print(a+" ");
            }
        }
    }
