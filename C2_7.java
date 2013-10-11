import java.io.*;
import java.util.*;
import CrackingCodeLibrary.*;


public class C2_7{

        public static LinkedListNode reverse(LinkedListNode head)
       {
          LinkedListNode temp;
          LinkedListNode previous=null;
          while(head!=null){             
            temp=head.next;
            head.next=previous; 
            previous=head;
            head=temp;
          }
          return previous;
       }

       public static LinkedListNode reverseR(LinkedListNode head,LinkedListNode previous)
      {
         LinkedListNode temp;
         if(head.next==null){
               head.next=previous;
               return head;
           }
         else {
         temp=reverseR(head.next,head);
         head.next=previous;
         return temp;     
         }
      }

        public static boolean isPalindrome(LinkedListNode head){
        LinkedListNode temp=head;
        LinkedListNode newhead=reverse(head); 
        while(temp!=null){
           System.out.println(temp.data+", "+newhead.data)  
           if( temp.data!=newhead.data)
                return false;
           temp=temp.next;
           newhead=newhead.next;       
         }
        return true;
}

        public static void main(String[] args) {
                int length = 10;
                LinkedListNode[] nodes = new LinkedListNode[length];
                for (int i = 0; i < length; i++) {
                        nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
                }
               
                for (int i = 0; i < length; i++) {
                        if (i < length - 1) {
                                nodes[i].setNext(nodes[i + 1]);
                        }
                        if (i > 0) {
                                nodes[i].setPrevious(nodes[i - 1]);
                        }
                }
                 nodes[length - 2].data = 9; // Uncomment to ruin palindrome
               
                LinkedListNode head = nodes[0];
                System.out.println(head.printForward());
                System.out.println(reverse(head).printForward());
                System.out.println(isPalindrome(head));
        }


}

