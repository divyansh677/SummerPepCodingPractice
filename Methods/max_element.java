package Methods;

public class max_element {
    public  static void  maxElement(int Array[]) {
        int max= Array[0];
        for(int i =0;i<Array.length;i++)
        if(Array[i]>max)
        {
            max = Array[i];
        }
        System.out.println(max);
        
    }
    public static void main(String[] args) {
        int Arr[] = {1,2,3,4,6,90,6,7,8};
        maxElement(Arr);

    }
}
