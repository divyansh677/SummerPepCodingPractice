package LambdaExpression;
// method Reference 
@FunctionalInterface
interface test{
   public void Display(String str);
}

public class MethodRefernce{
public static void main(String args[])
{
    test ml = System.out::println; // method Reference 
    ml.Display("hello");
}
}


// // method Reference 
// @FunctionalInterface
// interface test{
//    public void Display(String str);
// }


// public class Main{
// public static void reverse(String str)
// {
//     StringBuffer sb = new StringBuffer(str);
//     sb.reverse();
//     System.out.println(sb);
// }
// public static void main(String args[])
// {
//     test ml = Main::reverse; // method Reference 
//     ml.Display("hello");
// }
// }

//Date Representation
//Date class 
//calender class
// TimeZone Class

// import java.util.*;
// import java.text.*;

// public class Main{
//     public static void main(String args[])
//     {
//         // System.out.println(System.currentTimeMillis()/1000/60/60/25/365);
//         // Date date = new Date();
//         // System.out.println(date.getClass());
//         // System.out.println(date.getDate());
//         // System.out.println(date.getDay());
//         // System.out.println(date.getYear()+1900);
        
//         GregorianCalendar gc = new GregorianCalendar();
//         // System.out.println(gc.isLeapYear(2021));
//         // System.out.println(gc.get(Calendar.DATE));
//         System.out.println(gc.get(Calendar.DAY_OF_WEEK));
//         TimeZone tz = gc.getTimeZone();
//         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
//         String date = sdf.format(gc.getTime());
//         System.out.println(date);
//         System.out.println(tz);
       
//     }
// }
// // mm//dd/yyyy


// import java.util.*;
// import java.time.*;
// import java.time.temporal.*;
// import java.text.*;
// public class Main{
//     public static void main(String args[])
//     {
        // Date dt = new Date();
        // // System.out.println(dt.getDate());
        // GregorianCalendar gc = new GregorianCalendar();
        // SimpleDateFormat sft = new SimpleDateFormat("SS");
        // String date = sft.format(gc.getTime());
        // System.out.println(date);
        // LocalDate lc = LocalDate.now();
        // int year = lc.getYear();
        // LocalDate lc1 = LocalDate.of(2020,Month.MARCH,10);
       
    // System.out.println(lc1);    
        
//     }
// }






















