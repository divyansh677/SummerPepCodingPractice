package mutilThreaded;

import java.util.*;
import java.lang.*;
public class Runnable implements Runnable {
     public void run()
    {
        int i =1;
        while (true)
        {
            System.out.println(i+"hello");
            i++;
        }
    }
    public static void main(String args[])
    {
        
        Main m = new Main();
        Thread t = new Thread(m);
        t.start();
        
        
        int i =1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}



//  runnable Interface 

// import java.util.*;
// import java.lang.*;

// class my implements Runnable{
//      public void run()
//     {
//         int i =1;
//         while (true)
//         {
//             System.out.println(i+"hello");
//             i++;
//         }
//     }
// }
// public class Main{
//     public static void main(String args[])
//     {
        
//        my m = new my();
//        Thread t = new Thread(m);
//        t.start();
        
        
//         int i =1;
//         while(true)
//         {
//             System.out.println(i+"World");
//             i++;
//         }
//     }
// }


// import java.util.*;
// import java.lang.*;

// class my implements Runnable{
//      public void run()
//     {
//         int i =1;
//         while (true)
//         {
//             System.out.println(i+"hello");
//             i++;
//         } 
//     }
// }
// public class Main{
//     public static void main(String args[])
//     {
        
//       my m = new my();
//       Thread t = new Thread(m);
//       t.start();
        
        
//         int i =1;
//         while(true)
//         {
//             System.out.println(i+"World");
//             i++;
//         }
//     }
// }


// multithreaded 

// class my implements Runnable{
//     public void run()
//     {
//         System.out.println("Hello ");
//     }
// }

// public class Main{
//     public static void main(String args[])
//     {
//         my m = new my();

//         Thread t = new Thread(m);
//        Thread t = new Thread(new my(),"my thread");
//         t.setDaemon(true);
//         t.start();
 
        
        
//     }
// }


// class my extends Thread {
    
//     public my (String name)
//     {
//         super(name);
//         setPriority(Thread.MIN_PRIORITY+2);
//         // setPriority(Thread.MAX_PRIORITY);
//     }
   
// }

// public class Main{
//     public static void main(String args[])
//     {
//       Thread my = new Thread("my new thread");
//       System.out.println(my.getName());
//       System.out.println(my.getId());
//       System.out.println(my.getPriority());
//       my.start();
//       System.out.println(my.getState());
//       System.out.println(my.isAlive());
      
      
 
        
        
//     }
// }




// class my extends Thread {
    
//     public my (String name)
//     {
//         super(name);
//     }
//     public void run ()
//     {
//         int count = 1;
//         while(true)
//         {
//             System.out.println(count);
//             count++;
//             try{
//             Thread.sleep(1000);
//             }
//             catch( InterruptedException e)
//             {
//                 System.out.println(e);
//             }
            
//         }
//     }
   
// }

// public class Main{
//     public static void main(String args[])
//     {
//     //   Thread my = new Thread("my new thread");
//       my t = new my("my thread 1 ");
//       t.start();
//       t.interrupt();
      
      
 
        
        
//     }
// }



//  daemon thread are the dependend thread they will terminate as main thread will terminate


// class myThread extends Thread{
//     public void run(){
//         int count=1;
//         while(true)
//         {
//         System.out.println(count+"my thread");
//         count++;
//         }
        
//     }
// }


// public class Main{
//     public static void main(String args[])
//     {
//         myThread t = new myThread();
        
//         t.setDaemon(true);
//         t.start();
//         // try{t.sleep(1000);} catch(Exception e){}
        
//         // Thread mainThread = Thread.currentThread();
//         // try {
//         //       mainThread.join();
            
//         // } catch(Exception e) {
//         // }
//         int count = 0;
//         while(true)
//         {
//             System.out.println(count++ +"Main Thread");
//             // Thread.yield(); // allow other thread to execute //
            
//         }
        
     
//     }
// }

// using join we can let main method to wait to complete the thread even it a daemon;



//SYNCHORISATION 

