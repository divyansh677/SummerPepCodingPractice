package Methods;

public class ShowList {
    public static void show(int start,String ...s)
    {// counter control for loop 
        for(int i=0;i<s.length;i++)
        {
            // System.out.println(i+1+"."+ " "+s[i]);
            System.out.println(start+"."+ " "+s[i]);
            start++;
        }
        
    }
    public static void main(String ... args) {
        
        show(5,"DEV","RAJ","RAHUL","RANAV","MAHI"); 
    }
}


// variaable argument should be at last as we dont know how many input are there 