import java.io.*;
import java.util.*;

public class C4_6 {


 public static void main(String args[]){
  int[] array={1,2,3,4,5,6,7,8,9,10};
  TreeNode root= createMinimalBST(array,0,array.length);
  for(int i=0;i<array.length;i++) {
    TreeNode node= root.find(array[i]);
    TreeNode next=inorderSucc(node);
    if(next!=null){
             System.out.println(node.data + "->" +next.data);
        } else {
            System.out.println(node.data+"->"+null);
     }

   
   }
 }
}
