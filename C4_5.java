import java.io.*;
import java.util.*;

public class C4_5{


public static void copyTree(TreeNode root,ArrayList<Integer> data){
  if(root!=null){

    copyTree(root.left,data);
    data.add(root.data);
    copyTree(root.right,data);
  }

}


public static boolean checkBST(TreeNode root){

   ArrayList<Integer> data=new ArrayList<Integer>();
   copyTree(root,data);
   for(int i=0;i<data.size();i++)
    System.out.print(data.get(i)+" ");
    int j=1;
    while(j<data.size())
  {
     if(data.get(j)<=data.get(j-1)) return false;
    j++;
   }
   return true;  
   //LinkedList<TreeNode> queue
}


public static boolean checkBSTR(TreeNode root, int min, int max){
if(root==null) 
    return true;
if(root.data>=max||root.data<min)
       return false;
 if(!checkBSTR(root.right,root.data,max) || !checkBSTR(root.left,min,root.data)) return false;

return true;
}
public static TreeNode  createMinimalBST(int array[],int left, int right)
{
   int middle= (left+right)/2;
   TreeNode root= new TreeNode(array[middle]);
    if(left<middle-1)
        root.left=createMinimalBST(array,left,middle-1);
    if(middle+1<right)
        root.right=createMinimalBST(array,middle+1,right);

   return root;
}
  

  public static void main(String args[]){

   // int array[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
   int array[]= {1,3,5,6,9,10,11,13};
   TreeNode root= createMinimalBST(array,0,array.length);
//   root.left.right.data=100;
   System.out.println(checkBST(root));
   System.out.println(checkBSTR(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
  }

}

 class TreeNode {
  
  TreeNode left;
  TreeNode right;

  int data;
 
  public TreeNode(int data){
    this.data=data;
  }
}
