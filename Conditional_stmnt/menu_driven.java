import java.util.Scanner;

public class menu_driven {
    public static void main(String args[])
    {
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUl");
        System.out.println("DIV");
        int num1,num2;
        System.out.println("Enter the two number");
        Scanner  sc = new Scanner(System.in);
        num1=sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Choose the option");
        sc.nextLine();// to consume 
        //the enter key
         String option = sc.nextLine();
         option=option.toUpperCase();
         switch(option)
         {
            case "ADD": System.out.println(num1+num2);
            break;
            case "SUB": System.out.println(num1-num2);
            break;
            case "MUL": System.out.println(num1*num2);
            break;
            case "DIV": System.out.println(num1/num2);
            break;
            default:
            System.out.println("Invalid Option");
         }

       



    } 
}
// if after number we are taking the String then it may not except the STring Because the buffer stays in the keyboard so to avoid this write the nextline two times.