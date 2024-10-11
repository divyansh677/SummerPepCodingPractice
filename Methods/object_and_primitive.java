package Methods;

public class object_and_primitive {
    public void change(int X[],int index ,int value){
        X[index]= value;
    }
    public void change2(int A)
    {
        A=10;
    }
    public static void main(String[] args) {
        int A[] ={1,2,3,4,5,6,7,8};
        object_and_primitive op = new object_and_primitive();
        op.change(A,3,10);
        for(int a: A)
        {
            System.out.println(a);
        }
        int B=6;
        op.change2(B);
        System.out.println(B);
        
    }
}
