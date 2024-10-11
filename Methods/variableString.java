package Methods;

public class variableString {
    public static void ShowList(int start , String ...s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.println(start+" "+s[i]);
            start++;
        }
    }
    public static void main(String[] args) {
       
    ShowList(5,"hello","raj","rahul","mohan","rajan","raman","Ahemed");
    }
    
}
