import java.util.Scanner;

public class Magical_number {
    public static void main(String args[]){
        int num;
        Scanner scanner= new Scanner(System.in);
        num = scanner.nextInt();

        int[] myIntArray = new int[num];
        myIntArray[0]=0;
        for(int i=1;i<num;i++)
        {
            myIntArray[i] = myIntArray[i-1]+ i*i;

        }

        for(int i=0;i<num;i++)
        {
            System.out.println(myIntArray[i]);
        }

        


    }
}
