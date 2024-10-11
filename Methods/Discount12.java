package Methods;

public class Discount12 {
    public  double Discount(double ...price)
    {
        double sum =0.0;
        for(int i=0;i<price.length;i++)
        {
                sum+=price[i];
        }
        if(sum>1000)
        {
            return sum*0.15;
        }
        else{
            return sum*0.1;
        }
    }
    public static void main(String[] args) {
        Discount12 obj = new Discount12();
        double result=obj.Discount(232.12,12345.2,2.12345);
        System.out.println(result);
        
    }
}


// using dir v*.*  //==> I can search for all the file that startwith v same can be used for other concept
// notepad program.java
