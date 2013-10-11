import java.io.*;
import CrackingCodeLibrary.*;
import java.util.*;
public class C4_1{

       public static int getHeight(TreeNode<Integer> root) {
                if (root == null) {
                        return 0;
                }
                return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        }
               
        public static boolean isBalanced(TreeNode<Integer> root) {
                if (root == null) {
                        return true;
                }
                int heightDiff = getHeight(root.left) - getHeight(root.right);
                if (Math.abs(heightDiff) > 1) {
                        return false;
                }
                else {
                        return isBalanced(root.left) && isBalanced(root.right);
                }
        }


  public static void main(String[] args) {
                // Create balanced tree
                Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                TreeNode<Integer> root = new TreeNode<Integer>(0);
                root=root.createMinimalBST(array);
                System.out.println("Root? " + root.data);
                System.out.println("Is balanced? " + isBalanced(root));
                Integer array2[]=new Integer[100];
                Random rand= new Random();
                for(int i=0;i<array2.length;i++)
                {
                    array2[i]=rand.nextInt();
                }
                // Could be balanced, actually, but it's very unlikely...
                TreeNode<Integer> unbalanced = new TreeNode<Integer>(10);
                for (int i = 0; i < 10; i++) {
                        unbalanced.insertInOrder(array2[i]);
                }
                System.out.println("Root? " + unbalanced.data);
                System.out.println("Is balanced? " + isBalanced(unbalanced));
        }


}
