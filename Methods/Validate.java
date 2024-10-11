package Methods;

public class Validate {
   public  static boolean   Validate1(String name) 
    {
        
            if(name.matches("[a-zA-z\\s]+"))
            {
                return true;
            }
            return false;

    }
    public static boolean  Validate1(int age)
     {
        if(age>3 && age<15)
        {
            return true;
        }
        return false;
     }
    public static void main(String[] args) {
        int num =456;
    
        boolean result1= Validate1(num);
        boolean result2 = Validate1("An  uj  rf34rt");
        System.out.println(result1);
        System.out.println(result2);

    }
}
