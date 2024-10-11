package Loops;
import java.util.*;

// arithmatic progression because next term is obtained by adding 

public class G_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstTerm = sc.nextInt();
        int commonDiff=sc.nextInt();
        int noOfTerms = sc.nextInt();
        int term =firstTerm;
        for(int i=0;i<noOfTerms-1;i++) {
            System.out.println(term);
            term += commonDiff;

        }

    }
    
}
