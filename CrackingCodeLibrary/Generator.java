package CrackingCodeLibrary;
import java.util.*;
import java.awt.*;


public class Generator{
  public static LinkedListNode randomLinkedList(int N, int min, int max){
     LinkedListNode root= new LinkedListNode((int)(Math.round(Math.random()*(max-min))+min),null,null);
    LinkedListNode prev=root;
    for(int i=1;i<N;i++){
        int data=Math.round((float)(Math.random()*(max-min))+min);
        LinkedListNode next= new LinkedListNode(data,null,null);
        prev.setNext(next);
        prev=next;
   }
   return root;

}

}
