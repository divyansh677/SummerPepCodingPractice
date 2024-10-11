package Methods;

public class CAlling_not_static_function {
    
        public  int max_value (int a,int b)
        {
                if(a>b)
                return a;
                else
                return b;
        }
        public static void main(String[] args) {
            int num1=12,num2=34;
            CAlling_not_static_function cf = new CAlling_not_static_function();
            System.out.println(cf.max_value(num1,num2));

           
    
        
    
    }
    
}