package Methods;

public class Updating_array_value_by_another_method {
    public static void update(int a[])
    {
        a[0]=45;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        update(arr);
        System.out.println(arr[0]);
        
    }
    
}


