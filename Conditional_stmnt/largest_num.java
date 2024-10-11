import java.util.*;
class largest_num{
    public static void main(String args[])
    {
        int num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
        num1= scanner.nextInt();
        num2= scanner.nextInt();
  
  
        num3= scanner.nextInt();
        if(num1>num2 && num1>num3)
        {
           System.out.println(num1); 
        }else if(num2>num3){
        System.out.println(num2);

        } else {
            System.out.println(num3);
        }
    }
}