import java.util.Scanner;

public class Radix {
    public static void main (String args[])
    {
        String num;
        Scanner scanner= new  Scanner(System.in);
        num = scanner.nextLine();
        if(num.matches("[01]+"))
        {
            System.out.println("Radix is 2");
        }else if(num.matches("[0-7]+")){
            System.out.println("Radix is 8");
            
        } else if(num.matches("[0-9]+")){
            System.out.println("Radix is 10");


        }else if(num.matches("[a-fA-f0-9]+")){
            System.out.println("Radix is 16");
            
        } else{
            
            System.out.println("Invalid ");
        }

    }
}
