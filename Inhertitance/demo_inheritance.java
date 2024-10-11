class parent{
    parent() // error if private
 {
     System.out.println("Inside the Parent");
 }
}
// class child extends parent {
//       child()
//     {
//         System.out.println("Inside the child");
//     }
// }
// class GrandChild extends child{
//      GrandChild()
//     {
//         System.out.println("Inside the Grandchild");
//     }
// }



public class demo_inheritance {
    public static void main(String args[])
    {
        // GrandChild obj = new GrandChild();
       parent obj = new parent();
        
    }
   } 

