
package Inhertitance;



class parent {
    public parent(){
        System.out.println("This is the parent class  constructor");
    }
    

}

class child extends parent{
   public child(){
    System.out.println("This is the Child class constructor");
   }

}
 
class grandChild extends child{
    public grandChild(){
        System.out.println("This is the constructor of the grandchild");
    }
}
public class superConstructor {
    public static void main(String[] args) {
        child obj = new child();
        grandChild obj1 = new grandChild();
    }
}


// Single Inheritance.
// Multiple Inheritance.
// Multi-Level Inheritance.
// Hierarchical Inheritance.
// Hybrid Inheritance.


// // Interface 1
// interface Flyable {
//     void fly();
// }

// // Interface 2
// interface Swimmable {
//     void swim();
// }

// // Subclass implementing multiple interfaces
// class Duck implements Flyable, Swimmable {
//     @Override
//     public void fly() {
//         System.out.println("Duck is flying");
//     }

//     @Override
//     public void swim() {
//         System.out.println("Duck is swimming");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Duck myDuck = new Duck();
//         myDuck.fly();
//         myDuck.swim();
//     }
// }
