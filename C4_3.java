import java.io.*;
import java.util.*;



public class C4_3 {


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

    int array[]= {1,3,5,6,9,10,11};
//    int array[]= {1,3,5,6,9,10,11,13};
    createMinimalBST(array,0,array.length);
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

