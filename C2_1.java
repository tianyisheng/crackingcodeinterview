import java.util.*;
import CrackingCodeLibrary.*;

public class C2_1{
  public static void deleteDupsA(LinkedListNode head) {
  HashMap<Integer,String> hash=new HashMap<Integer,String>();
  LinkedListNode value=head;  
  LinkedListNode previous=null;  
  while(head!=null)
  {
    int data=head.data;
    if(hash.containsKey(head.data)) {
       previous.next=head.next;
     }
    else {
        hash.put(data,"");
        previous=head;
    }
   head=head.next;
  }
 head=value;
}

 public static void deleteDupsB(LinkedListNode head){
/**an implementation that we could not buffer the data of the linkedlist, so we need to use two iterator, one is iterator for **/
   if(head==null) return ;
   LinkedListNode current= head;
   LinkedListNode runner=head;
   LinkedListNode previous=null;
   while(current!=null)
   {
      if(current.next==null)
           return;
     runner=current.next;
     previous=current;
      while(runner!=null)
     {
       if(current.data==runner.data)
           previous.next=runner.next;
       else
          {
            previous=runner;
          }
        runner=runner.next;
     }

      current=current.next;
   }
}


  
  public static void main(String args[]){

   LinkedListNode head=Generator.randomLinkedList(100,0,5);
   System.out.println(head.printForward());
   deleteDupsA(head);
   System.out.println("After  deleting duplicates:");
   System.out.println(head.printForward());
   
   head=Generator.randomLinkedList(100,0,0);
   System.out.println(head.printForward());
   deleteDupsB(head);
   System.out.println("After  deleting duplicates:");
   System.out.println(head.printForward());
   
   
}
}
