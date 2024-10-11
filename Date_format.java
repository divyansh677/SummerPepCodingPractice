import java.util.*;

public class Date_format {


    public static void main(String args[])
    {
        String Date = "39/10/2021";
        int Lastindex= Date.lastIndexOf("/");
     int validYear=Integer.parseInt(Date.substring(Lastindex+1));

        if(validYear <1999  || validYear>2024)
        {
System.out.println("INvalid year");
        }
        else{
            System.out.println(Date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
        }
    }
}
