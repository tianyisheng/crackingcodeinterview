import java.io.*;
import java.util.*;
import CrackingCodeLibrary.*;

public class C2_4 {
   public static LinkedListNode Partition2(LinkedListNode head, int pivot)
{
   
   LinkedListNode smallerCursor=null;
   LinkedListNode biggerCursor=null;
   LinkedListNode current=head;
   LinkedListNode temp=null;
  
   while(current!=null) {   
   temp=current.next;
   current.next=null;

   if(current.data<pivot)
    {// insert before
       current.next=smallerCursor;
       smallerCursor=current;

    }else
   {
      current.next=biggerCursor;
      biggerCursor=current;
   }
    current=temp;
 }

  if(smallerCursor==null)
        return biggerCursor;
   else
   {
     head=smallerCursor;
     while(smallerCursor.next!=null) {

     smallerCursor=smallerCursor.next;
    }
     smallerCursor.next=biggerCursor;
    return head; 
  }

  
 
}
   public static LinkedListNode  Partition(LinkedListNode head,int pivot){
 /** insert after each node**/ 
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
               biggerCursor=biggerStart;
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
                smallerCursor=smallerStart;
             } else {
                smallerCursor.next=current;
                smallerCursor=current;
             }
 
        }
        current=next;
       
   }
   if(smallerStart==null)
          return biggerStart;
   
   smallerCursor.next=biggerStart;
   return smallerStart;
} 


public static void main(String args[]) { 
   LinkedListNode head=Generator.randomLinkedList(10,0,10);
   System.out.println(head.printForward());
   head=Partition2(head, 5); 
   System.out.println(head.printForward());


//   head=Generator.randomLinkedList(10,0,10);
//   System.out.println(head.printForward());
//   Partition2(head, 5); 
//   System.out.println(head.printForward());
}
}
