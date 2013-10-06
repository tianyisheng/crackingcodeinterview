import java.io.*;
import java.util.*;
import CrackingCodeLibrary.*;

public class C2_2 {

public static LinkedListNode  findKLast(LinkedListNode head,int k)
  {
      LinkedListNode current=head;
      if(k==0) {
      while(current.next!=null) {
        current=current.next;
      }
       return current;          
      }
       else
         {
          while(current.next!=findKLast(head,k-1)){
                current=current.next;
          }
          return current;
         }
  }

  public static LinkedListNode findKLastI(LinkedListNode head, int k){
 /**iteratively find the K-th last element, reversely find 1st last, then 2st last, and etc**/
  LinkedListNode current=head;
  LinkedListNode last=null;
   for(int i=0;i<k;i++)
  {
     current=head;
     while(current.next!=last){
           current=current.next;
     }
     last=current;
  }
  return current;
}

  public static LinkedListNode findKLastS(LinkedListNode head, int k){
 /**runner agorithm,smallest way to find the K-th last element, at frst find the kth element, then run two pionter simultanelously, one from the head, one from the k-thelement, end util the k-th reach the end, return the other  **/
  LinkedListNode runnerK=head;
  LinkedListNode runner0=head;
  
  while(k-->0)
  {
   runnerK=runnerK.next;
  } 

  while(runnerK.next!=null)
 {
   runnerK=runnerK.next;
   runner0=runner0.next;
 }
  return runner0;
}
   public static void main(String args[]){

   LinkedListNode head=Generator.randomLinkedList(10,0,10);
   System.out.println(head.printForward());
   System.out.println(findKLast(head,5).data);
   System.out.println(findKLast(head,6).data);
   System.out.println(findKLast(head,7).data);
   System.out.println(findKLast(head,8).data);
   System.out.println(findKLastI(head,5).data);
   System.out.println(findKLastI(head,6).data);
   System.out.println(findKLastI(head,7).data);
   System.out.println(findKLastI(head,8).data);
   System.out.println(findKLastS(head,5).data);
   System.out.println(findKLastS(head,6).data);
   System.out.println(findKLastS(head,7).data);
   System.out.println(findKLastS(head,8).data);   
}
}
