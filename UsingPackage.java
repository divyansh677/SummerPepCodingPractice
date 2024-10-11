import myPack1.Demo;
import myPack1.Demo2;
import myPack1.inner.Demo3;

public class UsingPackage {
    public static void main(String[] args) {
        
        Demo dm = new Demo();
        dm.display();

        Demo2 dm2 = new Demo2();
        dm2.display();

        Demo3 dm3= new Demo3();
        dm3.display();
    }
    
}
