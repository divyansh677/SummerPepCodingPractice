package Loops;

public class Display_a_number_with_trailing_zero {
   public static void main(String args[]){
    int num=1700;
    String rev ="";
    while(num!=0)
    {
        int last = num%10;
        rev =rev+last;
        num/=10;
    }
    for(int i=rev.length()-1;i>=0;i--){
        char value = rev.charAt(i);
        String output="";
        switch(value)
        {
            case '0': output="zero";
            break;
            case '1':  output="one";
            break;
            case '2':  output="two";
            break;
            case '3':  output="three";
            break;
            case '4':  output="four";
            break;
            case '5':  output="five";
            break;
            case '6':  output="six";
            break;
            case '7':  output="seven";
            break;
            case '8':  output="eight";
            break;
            case '9':  output="nine";
            break;

        }
        System.out.print(output+" ");
    }
   }

    
}
