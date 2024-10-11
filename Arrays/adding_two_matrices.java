package Arrays;
import java.util.*;
public class adding_two_matrices {
    public static void main(String[] args) {
        int row;
        int column;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column= sc.nextInt();
        int maxtix1[][]= new int[row][column];
        int maxtix2[][]= new int[row][column];
        
        for(int i=0;i<maxtix1.length;i++)
        {
            for(int j=0;j<maxtix1[i].length;j++){
            maxtix1[i][j]=sc.nextInt();
        }
    }
    
    for(int i=0;i<maxtix1.length;i++)
    {
        for(int j=0;j<maxtix1[i].length;j++){
                maxtix2[i][j]=sc.nextInt();

            }
        }
       
            for(int i=0;i<maxtix1.length;i++)
            {
                for(int j=0;j<maxtix1[i].length;j++){
                maxtix1[i][j]= maxtix1[i][j]+maxtix2[i][j];
                }
            }
        
        for(int x[]: maxtix1)
        {
            for(int y: x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    
}
