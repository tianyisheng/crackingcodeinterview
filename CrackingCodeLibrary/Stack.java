package CrackingCodeLibrary;
public class Stack{
  Node top;
  
public Object pop(){
   if(top!=null){
   Object item=top.data;
   top=top.next;
   return item;
  }
   return null;
}

public  void push(Object item) {
    Node t=new Node(item,null,null);
    t.next=top;
    top=t;

 }

public Object peek(){
  if(top==null)
              return null;
  return top.data;
}

public boolean isEmpty()
{
 return top==null;
}

}
