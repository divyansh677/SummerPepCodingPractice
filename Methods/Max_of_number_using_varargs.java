package Methods;
import java.util.*;



public class Max_of_number_using_varargs{
     static int max_element(int ...number)
    {
        if(number.length==0){
            return Integer.MIN_VALUE;
        }
        int max= number[0];
        for(int i =1;i<number.length;i++)
        {
            if(number[i]>max){
                    max= number[i];
            }
        }
    return max;
    }
    public static void main(String[] args) {
     int result1=    max_element(1,24,2,3,443,34,5,34);
     int result2=    max_element(1,24,2,34,5,34);
     System.out.println(result1);
     System.out.println(result2);
     int result3 = max_element();
     System.out.println(result3);
    }
}