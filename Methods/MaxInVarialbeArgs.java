package Methods;

public class MaxInVarialbeArgs {
    public static int maximum(int ...num)
    {
        int len = num.length;
        int max = num[0];
        if(len==0) return Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {
            if(num[i]>max)
            {
                max = num[i];
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int result=maximum(1,23,4,5,7,65,4,3,2,4);
        System.out.println(result);
    }
}
