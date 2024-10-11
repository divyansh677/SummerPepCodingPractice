package Interface;
interface Test{
    void method1();
    void method2(); // bydefault they are abstract method //
    
}

class myText implements Test{
    public void  method1()
    {
    System.out.println("this is method1");
    }
    public void method2()
    {
        System.out.println("This is method2");
    }
    public void method3()
    {
        System.out.println("This is method3");
    }
}

public class interface
{
	public static void main(String[] args) {
        // myText obj = new myText();
        // obj.method1();
        // obj.method2();
        // obj.method3();
        // Test obj = new myText(); // Dynamic method dispatch 
        // obj.method1();
        // obj.method2();
        // obj.method3();  // this line will give an error
	}
}


// interface are meant to inplement the runtime polymorphism
// they only meant for function overridding

    

