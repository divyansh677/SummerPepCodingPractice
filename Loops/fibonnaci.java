package Loops;
import java.util.*;
public class fibonnaci {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int pre=0;
        int curr=1;
        System.out.print(pre +" "+curr);
        int nextTerm = 0;
        for(int i =2;i<n;i++)
        {
                nextTerm = pre+curr;
                System.out.print(" " +nextTerm);
                pre= curr;
                curr=nextTerm;

                nextTerm = pre+curr;
        }
    }
}
