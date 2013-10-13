import java.io.*;
import java.util.*;
import CrackingCodeLibrary.*;

public class C4_7 {

public static class Result{
   public TreeNode node;
   public boolean isAncestor;
   public Result(TreeNode n, boolean isAncestor){
   node=n;
   this.isAncestor=isAncestor;
 }
}

  public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q)
{
    
}
 
  public static void main(String args[]){

   int [] array={1,2,3,4,5,6,7,8,9,10};
   TreeNode root =TreeNode.createMinimalBST(array);
   TreeNode n3=root.find(10);
   TreeNode n7=root.find(6);
   TreeNode ancestor=commonAncestor(root,n3,n7);
   if(ancestor!=null)
     System.out.println(ancestor.data);
   else
    System.out.println("null");
  }
}
