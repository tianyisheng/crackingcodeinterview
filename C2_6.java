import java.io.*;
import java.util.*;
import CrackingCodeLibrary.*;

public class C2_6{

  public static LinkedListNode FindBeginning(LinkedListNode node){
  LinkedListNode fastRunner=node;
  LinkedListNode slowRunner=node;
   while(fastRunner!=null&&fastRunner.next!=null)
  {
    fastRunner=fastRunner.next.next;
    slowRunner=slowRunner.next;
    if(slowRunner==fastRunner)
        break;
  }
   if(slowRunner==null||fastRunner==null){
   return null;
  }

  slowRunner=node;
   
  while(slowRunner!=fastRunner)
  {
   fastRunner=fastRunner.next;
   slowRunner=slowRunner.next;
  }
  return slowRunner; 
 
}
   

   public static void main(String args[]){
   int list_length=100;
   int k=10;
   
   //craete linked list;
   LinkedListNode[] nodes=new LinkedListNode[list_length];
   for(int i=0;i<list_length;i++){
       nodes[i]=new LinkedListNode(i,null,i>0?nodes[i-1]:null);
   }
   // create loop;
  nodes[list_length-1].next=nodes[list_length-k];
  System.out.println("result should be :"+nodes[list_length-k].data); 
  LinkedListNode loop=FindBeginning(nodes[0]);
  if(loop==null) {
       System.out.println("No cycle");
   }else {
       System.out.println(loop.data);
   }
     
}
}
