package Methods;

public class void_method {
    public void increase(int x)
    {
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int num=23;
        void_method vm = new void_method();
        vm.increase(num);
    
    }
    
}
