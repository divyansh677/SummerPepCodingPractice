

class rectange{
    private int length;
   private int breadth;

   rectange()
   {
       length=breadth = 1;
   }
   rectange(int l, int b){
       length=l;
       breadth = b;

   }
   public  int Area()
   {
       return length*breadth;
   }

}
class cuboid1 extends rectange{
   int height;
   cuboid1()
   {
       height=1;
   }
   cuboid1 (int h)
   {
       height= h;

   }
   cuboid1(int l ,int b ,int h)
   {
       super(l,b);
       height= h;
   
   }
   public int  volume()
   {
       return Area()*height;
   }

}

public class Cuboid {
   public static void main(String[] args) {
       cuboid1 obj = new cuboid1();
       cuboid1 obj1 = new cuboid1(12);
       cuboid1 obj2 = new cuboid1(1,2,3);
       System.out.println(obj.volume());
       System.out.println(obj1.volume());
       System.out.println(obj2.volume());
   }
}
