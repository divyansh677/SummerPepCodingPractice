package javaUniversal;


// public class allProgream {
    
// }
//  all packages are available in src //
// Runnable--> interface used in interface //


// import java.lang.String;
// import java.lang.*;

// public class Main{
//     static public void main(String args[])
//     {
//         java.lang.String str = new String("Hello");
//         System.out.println(str);
//     }
// }




//Inner classes 
// import java.util.*; 
// class outer{  // two class files outer.class outer $inner.class
//     int x=10;
    
//     class inner{
//         int y=40;
//          public void innerDisplay()
//         {
//             System.out.println("I'M in the Inner classes");
//         }}
//      public void outerClass() {
//     System.out.println("I'M in the outer classes");
//     inner in = new inner();
//     in.innerDisplay();
//     System.out.println(in.y);
// }

    
    
// }
// public class Main
// {
// 	public static void main(String[] args) {
// 	    outer out = new outer();
// 	    out.outerClass();
// 	    // inner class object // 
// 	    outer.inner obj = new outer().new inner();
// 	    obj.innerDisplay();
// 	}
// }


// // interfaces and classes
// class phone{
//     public void call()
//     {
//         System.out.println("I'm calling ");
//     }
//     public void msg()
//     {
//         System.out.println("I'm msging ");
//     }
//     public void camera()
//     {
//         System.out.println("I'm clicking photos");
//     }
    
// }

// interface Icamera{
//     final static int X=20;
//     void photo();
//     void video();
//     //  static methods can be there and final variable
    
//      public static void InterfaceMethod(){
//         System.out.println("Inside the interfaceMethod");
//     }
    
// }

// interface Imusic{
//     void play();
//     void pause();
//     void next();
// }

// interface IcameraMusic extends Imusic,Icamera{ 
//     void meth2();
// }

// class SmartPhone extends phone implements Icamera,Imusic{
//     public void  videoCall()
//     {
//         System.out.println("I'm VideoCalling");
//     }
//     public void photo()
//     {
//         System.out.println("photo");
//     }
//     public void video()
//     {
//         System.out.println("video");
//     }
//     public void play()
//     {
//         System.out.println("play");
//     }
//     public void pause()
//     {
//         System.out.println("pause");
//     }
//     public void next()
//     {
//         System.out.println("next");
//     }
// }

// public class Main{
//     public static void main(String args[])
//     {
//         SmartPhone sm = new SmartPhone();
//         sm.videoCall();
//         sm.play();
//         sm.pause();
//         sm.next();
        
//     }
// }




//  lOCAL INNERCLASSES 


// class outer{
    
//     void inner(){
//         class inner{
//             void innerDisplay()
//             {
//                 System.out.println("Hello how are you ");
//             }
//         } 
        // inner i = new inner();
        // i.innerDisplay();
        
        // .... Anonymous object 
    // new inner().innerDisplay();
        
//     }
// }


// public class Main{
    
//     public static void main(String args[])
//     {
//         outer  o = new outer();
//         o.inner();
//     }
// }


// Anonymous class  : Basically they are used to implement abstract class or interface they dont have any name.
// abstract class student{
//   abstract void stuDetails();
// }
//  class outer {
     
//      public void display()
//      {
// this is not obj of interface it is obj anonymous classs
//          student st = new student(){
//              public void stuDetails()
//              {
//                  System.out.println("Student Details are Displayed There");
//              }
//          };
//          st.stuDetails();

//  this can also be done without making any refernce 
//  new Student(){ public void stuDetails(){System.out.println("stuDetails are There")}}.stuDetails();

         
//      }
//  }
 
 
//  public class Main{
//      public static void main(String args[])
//      {
//          outer ot = new outer();
//          ot.display();
//      }
//  }


//  Using Anonymousclass on interface 

// interface phone{
//     public void call();
    
// }

// class SmartPhone{
//   void display()
//   {
//         phone p = new phone()
//     {
//         public void call()
//         {
//             System.out.println("calling from Smart Phone");
//         }
//     };
//     p.call();
//   }
// }

// public class Main{
//     public static   void main(String args[])
//     {
//         SmartPhone sp = new SmartPhone();
//         sp.display();
//     }
// }

// Static classes can access the static member of the outer classes only;
//  we can create the non-static methods and variables inside the static inner classes 
// but they are associated to the particular instances of the classes not with the classes
//also u cant access non static member of the outerclass


// class outer {
//     static int x = 34;
//     int y=90;
    
//     static class  inner{
//         public void display()
//         {
//             System.out.println("Inside the innerStatic classes"+x);
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args)
//     {
//         outer.inner oi = new outer.inner();
//         oi.display();
//     }
// }


// static is used to show the meta data like data about class though obj can share this 
//  static variable
// static method
//  static class
// static blocks

//  static variables can be used inside static methods and non-static methods also 

//  static variables are created inside the method area so they are available once the class is loaded


// class honda {
//     static int price = 90_00_00;
//     int a,b;
    
//     public static double showprice(String city)
//     {
//         switch(city.toLowerCase())
//         {
//             case "delhi" : return price*price*0.1;
//             case "mumbai" : return price*price*0.5;
//             default : return 0;
//         }
        
       
//     }
// }

// public class Main
// {
//     public static void main(String args[])
//     {
//         System.out.println(honda.price);
        
//         double result = honda.showprice("Delhi");
//         System.out.println(result);
//     }
// }


//  we can not use this and super in the static class or method as they belongs to instance not to the class

//  outerClasses can not be static 
public class Main{
    final static int X ;
        static
        {
            X=10;
            // System.out.println("This is static block 1");
        }
    static public void main(String args[])
    {
    final int Y=34;
        
        System.out.println("final value of x is " +Y);
        // System.out.println("this is main block ");
    }
    // static 
    // {
    //     System.out.println("This is static block 2");
    // }
}

//  static blocks are being exected while loading the class by class loader
//  main is executed after all static blocks

//  final is just  like constant --> there value is fixed can modified
//  variables should be in CapitalLetter

// final variables can be direclty initalised , inside static  block or constructor( but  in every constructor we dont know which one will be called )

//  we can not Override final methods 
//  we can not Inherit final class only we can create the object only;;


//  we have to initalised final variable if it is outside the method and are direct member of class;



// Singleton class --> only one object can  be created

// import java.util.*;
// class coffie{
//     private int coffie;
//     private int milk ;
//     private int water;
    
//     private coffie()
//     {
//         coffie=1;
//         water=1;
//         milk=1;
//     }
//     // private coffie(int coffie,int milk,int water)
//     // {
//     //     this.coffie=coffie;
//     //     this.water=water;
//     //     this.milk=milk;
//     // }
    
//     public static coffie instance = null;
//     public static  coffie getInstance()
//     {
//         if(instance==null)
//         {
//             instance = new coffie();
//         }
//         return instance;
//     }
    
//     public static  coffie getInstance(int milk,int water,int coffie)
//     {
//         if(instance==null)
//         {
//             instance = new coffie(milk,water,coffie);
//         }
//         return instance;
//     }
    
    
    
    
  
    
    
    
// }

// public class Main{
    
//     public static void main(String args[])
//     {
//         // singleton classes 
//       coffie cp1 = coffie.getInstance(); 
//       coffie cp2 = coffie.getInstance(); 
//       coffie cp3 = coffie.getInstance(); 
//       if(cp1==cp2 && cp2==cp3)
//       {
//           System.out.print("same");
//       }
        
//     }
// }


// singleton class



// auto generated RollNumber 


// class StudentDetails{
//     private String StudentName;
//     private String Standard;
//     private String AdmissionNumber;
    
//     private static int  SerialNumber=0;
//     public  String GenerateAdmissionNumber()
//     {
//         Date date = new Date();
        
//         SerialNumber++;
//         return "LPU "+(date.getYear() + 1900)+" " + SerialNumber;
    
//     }
    
    
//     public StudentDetails(String StudentName,String Standard)
//     {
//         this.StudentName = StudentName;
//         this.Standard = Standard;
//         this.AdmissionNumber = GenerateAdmissionNumber();
        
        
//     }
    
//     public String toString(){
//         return "AdmissionNumber : "+ AdmissionNumber+"\n" +"StudentName : "+StudentName +"\n"+"Standard : "+Standard;  
//     }
 
    
// }

// public class Main{
//     public static void main(String args[])
//     {
//         StudentDetails sd1 =  new StudentDetails("dev", "12");
//         StudentDetails sd2 =  new StudentDetails("Raj", "11");
//         StudentDetails sd3 =  new StudentDetails("Ayu", "10");
//         System.out.println(sd1);
//         System.out.println(sd2);
//         System.out.println(sd3);
        
//     }
// }





// import java.lang.*;

//OBJECT CLASS

// public class Main
// {
// 	public static void main(String[] args) {
// 		Object obj1= new Object();
// 		Object obj2= new Object();
// 		Object obj3= obj1;
		
// // 		System.out.println(obj1.equals(obj2));
// // 		System.out.println(obj1.equals(obj3));
// // 		System.out.println(obj1.hashCode());
// // 		System.out.println(obj1.getClass());
// 		System.out.println(obj1);

		
		
// 	}
// }


//  every class is directly or indirectly inherited from the object class 
// import java.lang.*;

// class myObject implements Cloneable{
//     public String toString()
//     {
//         return " My objects";
//     }
    
//     public int hashCode()
//     {
//         return 100;
//     }
//     public boolean equals(Object obj)
//     {
//         return this.hashCode()==obj.hashCode();
//     }
    
//     @Override
//     public myObject clone() throws  CloneNotSupportedException {
//         return (myObject) super.clone();
//     }
// }


//  we can not Override final methods

// public class Main
// {
// 	public static void main(String[] args) {
// 	myObject obj1= new myObject();
// 	try{
// 	myObject obj2= obj1.clone();
// 	}
// 	catch( CloneNotSupportedException e)
// 	{
	    
// 	}
// 	myObject obj2= new myObject();
// 		Object obj1= new myObject();

// 		System.out.println(obj1.hashCode());
// 		System.out.println(obj1.hashCode());
// 		System.out.println(obj2.equals(obj1));
		

		
		
// 	}
// }

// WRAPPER CLASSES 
// public class Main{
//     public static void main(String args[])
//     {
//         Integer a = new Integer(12);
//         Integer b = Integer.valueOf("23");
//         Integer c = 23;
        
//         Short s = Short.valueOf("3");
        
//         byte B= 34;
//         Byte bb = Byte.valueOf(B);  // Auto boxing
        
//         Float f = Float.valueOf("234.23");
//         float cc= f.floatValue();
//         float ff= f; //auto unboxing
        
//     }
// }


// String vs StringBuffer vs StringBuffer
// import java.util.*;
// public class Main{
//     static public void main (String args[])
// {
// Scanner sc = new Scanner(System.in);
// String str1 = sc.nextLine();
// String str2= sc.nextLine();
// StringBuffer str3= new StringBuffer(str1);
// StringBuffer str4= new StringBuffer(str2);
// // str3.reverse();
// // str3.append(str4);
// // str3.deleteCharAt(3);
// // str3.delete(2,5);
// // str3.insert(4,"sdf");
// // String str5 = str3.substring(3);
// // int index = str3.indexOf("d");
// // int index = str3.lastIndexOf("d");
// // char ch = str3.charAt(2);
// // String str=str3.toString().trim();   // trim works on String
// String str = "hello        jbdsfkjbs jb kjdbs kfj bsdk".replaceAll("//s+","");
// System.out.println(str);

// // Character.isApha()
// // Character.isdigit()
// // Character.isAplhaOrDigit()
// //Str.length();
// }
// }




// Interger Wrapper classses
import java.util.*;

public class Main{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        double num = sc.nextDouble();
        // String bin = Integer.toBinaryString(num);
        
        // double num1 = Math.sqrt(num);
        // double num1 = Math.pow(num,2);
        // double num1 = Math.nextAfter(12.3,13);
        // double num1 = Math.tan(45*Math.PI/180);
        // double num1 = Math.ceil(num);
        // double num1 = Math.floor(num);
        // double num1 = Math.abs(num);
        // max(),min(),random, math.round(),floorDiv(),
        
        // System.out.printf("%2.2f", num1);
        // System.out.println(num1);
    }
}