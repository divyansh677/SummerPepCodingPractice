package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class Generic {
   private  class TreeNode{
        int data ;
        ArrayList<TreeNode> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        int arr[] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40};
        TreeNode root;

        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]==-1)
            {
                st.pop();
            }
            else{
                TreeNode newnode = new TreeNode();;
                newnode.data =arr[i];
                if(st.size()>0)
                {
                    st.peek().children.add(newnode);
                }else{
                    root = newnode;
                }
            }

        }

    }
    
}
