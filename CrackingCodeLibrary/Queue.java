package CrackingCodeLibrary;

public class Queue{
Node first,last;

void enqueue(Object item){
  if(first==null){
     last=new Node(item,null,null);
     first=last;
    }
    else {
       last.next=new Node(item,null,null);
       last=last.next;
    }
}

Object dequeue(){

  if(first!=null){
    Object item=first.data;
    first =first.next;
    return item;
   }
   return null;
}

}
