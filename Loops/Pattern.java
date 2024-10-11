package Loops;
import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
int count=1;
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {   
                // System.out.print(j+" ");
                // System.out.print(i+" ");
                // System.out.print(i+j+" ");
                System.out.format("%-2d ",count++);
            }
            System.out.println();
        }
    }
    
}
