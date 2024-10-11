package Methods;

public class Discount {
    static double Discount(double ... price)
    {
        double sum = 0.0;
        double discount =0.0;
        for(int i=0;i<price.length;i++)
        {
            sum += price[i];
        }
        if(sum <500)
        {
                discount =sum*10/100;
        }
        else if(sum >=500 && sum<1000)
        {
                discount =sum*15/100;
              
            }
            else{
            discount =sum*20/100;

        }
        return discount;
    }
    public static void main(String[] args) {
        double result= Discount(2.3,12.0,3.2,2.3,33.2);
        System.out.println(result);

}
}