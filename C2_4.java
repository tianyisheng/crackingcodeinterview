import java.io.*;
import java.util.*;
import CrackingCodeLibrary.*;


public class C2_4 {
   public static void Partition(LinkedListNode head,int pivot){
  
   LinkedListNode smallerStart=null;
   LinkedListNode smallerCursor=null;
   LinkedListNode biggerStart=null;
   LinkedListNode biggerCursor=null;
   LinkedListNode current=head;
   LinkedListNode next=null;

   while(current !=null){
        next=current.next;
        current.next=null;

        if(current.data>pivot){
            if(biggerStart==null) {
               biggerStart=current;
               biggerCursor=current;
             }
            else
             {
               biggerCursor.next=current;
               biggerCursor=current;
             }
        }
        else {
             if(smallerStart==null) {
                smallerStart=current;
                smallerCursor=current;
             } else {
                smallerCursor.next=current;
                smallerCursor=current;
             }
 
        }
        current=next;
       
   }
   if(smallerStart==null)
          head=biggerStart;
   
   smallerCursor.next=biggerStart;
   head= smallerStart;
} 

   public static void main(String args[]) { 
   LinkedListNode head=Generator.randomLinkedList(10,0,10);
   System.out.println(head.printForward());
   Partition(head, 5); 
   System.out.println(head.printForward());
}
}
