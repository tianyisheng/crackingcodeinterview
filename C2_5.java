import java.io.*;
import java.util.*;
import CrackingCodeLibrary.*;

public class C2_5{

 public static LinkedListNode sum(int carrier ,LinkedListNode m, LinkedListNode n)
{
    if( m==null&&n==null&&carrier==0)
         return null;
    
    if(m==null && n==null)
         return new LinkedListNode(carrier,null,null);
    
    if(m==null) {
     int newCarrier=(carrier+n.data)/10;
     int sums=(carrier+n.data)%10;

     LinkedListNode result=new LinkedListNode(sums,null,null);
     result.next=sum(newCarrier,null,n.next);
     return result;
    }   

    if(n==null) {
      
     int newCarrier=(carrier+m.data)/10;
     int sums=(carrier+m.data)%10;

     LinkedListNode result=new LinkedListNode(sums,null,null);
     result.next=sum(newCarrier,null,m.next);
     return result;
    }

    int newCarrier=(carrier+m.data+n.data)/10;
    int sums=(carrier+m.data+n.data)%10;   
    
    LinkedListNode result=new LinkedListNode(sums,null ,null);
     result.next=sum(newCarrier,m.next,n.next);
    return result;
   }
 
   public static LinkedListNode sumInverse(){

   
}
public static void main(String args[]) { 
   LinkedListNode numberA=Generator.randomLinkedList(10,0,9);
   LinkedListNode numberB=Generator.randomLinkedList(8,0,9);
   System.out.println(numberA.printForward());
   System.out.println(numberB.printForward());
   LinkedListNode sum=sum(0,numberA,numberB); 
   System.out.println(sum.printForward());
   /**inverse order**/
   LinkedListNode sum=sumInverse(numberA,numberB); 
   System.out.println(sum.printForward());
}
}
