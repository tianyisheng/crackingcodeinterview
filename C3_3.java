import java.util.*;
import java.io.*;

public class C3_3{
   ArrayList<Stack> stacks=new ArrayList<Stack>();
   public int capacity; 
   
   public C3_3(int cap){
    this.capacity=cap;
   }  
   
   public Stack getLastStack(){
    if(stacks.size()==0)
       return null;
   return stacks.get(stacks.size()-1);
   }

   public void push(int v){

   Stack last=getLastStack();
   if(last==null||last.size()==capacity){
      Stack stack=new Stack();
      stack.push(v);
      stacks.add(stack);
   }else
     last.push(v);

   }

   public int pop()
  {
    Stack last=getLastStack();
    if(last==null)
        return Integer.MIN_VALUE;
    int v=(Integer)last.pop();
    if(last.empty()==true)
        {
            stacks.remove(stacks.size()-1);
        }
    return v;
  }
  
  public static void main(String args[]){
  int capacity=5;
  C3_3 set =new C3_3(capacity);
  for(int i=0;i<34;i++){
    set.push(i);
System.out.print(set.stacks.size()+" .");
  }

  for(int i=0;i<34;i++){
    System.out.println(set.pop());
  }
 }
}
