package Methods;
// if I'm making it double it wil work for all the data types// 
public class Sum_using_varargs {
    static int sum(int ...A)
    {
        int sum =0;
        for(int i=0;i<A.length;i++)
        {
            sum+=A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int result= sum(1,2,3,4,5);
        System.out.println(result);
    }
}
