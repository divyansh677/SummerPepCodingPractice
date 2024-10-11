package ExceptionHandling;


import java.lang.*;
import java.io.*;
import java.util.*;

class OverflowException extends Exception{
    public String toString()
    {
        return " This is OverflowException";
    }
}

class UnderflowException extends Exception{
    public String toString()
    {
        return " This is UnderflowException";
    }
}

public class StudentChallenge {
    public static Integer pop(Deque<Integer> stack)throws UnderflowException
    {
        if(stack.isEmpty())
        {
            throw new UnderflowException();
        }
        else{
             return stack.pollLast();
        }
    }
     public static boolean push(Deque<Integer> stack,Integer num) throws OverflowException
    {
        if(stack.size()==5)
        {
            throw new OverflowException();
        }
        else{
            return stack.offerLast(num);
        }
    }
    public static void main(String args[])
    {
        Deque<Integer> Stack = new LinkedList<>();  //Arrays.asList{1,2,3,4,5}
        
        // Deque is  abstract so use its concrete class to implement
        try{
            push(Stack,1);
            push(Stack,2);
            // pop(Stack);
            // pop(Stack);
            // pop(Stack);
            
            // push(Stack,3);
            // push(Stack,4);
            // push(Stack,5);
            // push(Stack,6);
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            for (Integer i : Stack)
            {
                System.out.println(i);
            }
        }
        
        
        
    }
    
    
}




// import java.lang.*;
// import java.io.*;
// import java.util.*;

// class OverflowException extends Exception{
//     public String toString()
//     {
//         return " This is OverflowException";
//     }
// }

// class UnderflowException extends Exception{
//     public String toString()
//     {
//         return " This is UnderflowException";
//     }
// }

// class Stack{
//     private int length;
//     private int top = -1;
//     private int  arr[];
    
//     public Stack(int length)
//     {
//         this.length = length;
//       arr = new int[this.length]; 
//     }
    
//     public void push(int x) throws OverflowException
//     {
//         if(top==length-1)
//             throw new OverflowException();
//         top++;
//         arr[top] = x;
    
        
//     }
//     public int pop() throws UnderflowException
//     { int x= -1;
        
//         if(top==-1)
//          throw new UnderflowException();
//          x = arr[top];
//          top--;
//          return x;
        
        
//     }
//     void display()
//     {
//          for (int i =0 ; i<=top;i++)
//             {
//                 System.out.println(arr[i]);
//             }
//     }
// }

// public class Main{
//     public static void main(String args[])
//     {
//            Stack st = new Stack(5);
//        try{
//         //   st.push(23);
//         //   st.push(2);
//         //   st.push(2);
//         //   st.push(2);
//         //   st.push(2);
//         //   st.push(2);
//         st.pop();
//            st.display();
//        }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
       
        
        
        
//     }
    
    
// }



