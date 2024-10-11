package mutilThreaded;

//  class Thread

import java.util.*;
import java.lang.*;


class Mythread extends Thread {
    public void run()
    {
        int i =1;
        while (true)
        {
            System.out.println(i+"hello");
            i++;
        }
    }
}

public class Mythread
{
    public static void main(String args[])
    {
        Mythread t = new Mythread();
        t.start();
        
        
        int i =1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}




//  in single file 

// import java.util.*;
// import java.lang.*;
// public class Main extends Thread {
//      public void run()
//     {
//         int i =1;
//         while (true)
//         {
//             System.out.println(i+"hello");
//             i++;
//         }
//     }
//     public static void main(String args[])
//     {
        
//         Main t = new Main();
//         t.start();
        
        
//         int i =1;
//         while(true)
//         {
//             System.out.println(i+"World");
//             i++;
//         }
//     }
// }
