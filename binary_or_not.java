import java.lang.*;
import java.util.*;
public class binary_or_not {    
   public static void main(String args[]){
   int   binary_no =1010101010;
   String Str_binary_no = String.valueOf(binary_no);
   // String Str_binary_no = binary_no+"";
   System.out.println(Str_binary_no.matches("[01]+"));
}}

// atleast one "[01]+"
// Zero or more "[01]*"