import java.io.*;
import CrackingCodeLibrary.*;
public class C3_2 extends Stack{

  Stack minStack;
  
  public C3_2(){
   minStack=new Stack();
  }
 
  public void push(int value){
    if(value<=min()) {
        minStack.push(value);
    } 
        super.push(value);
  }

  public Integer min(){
   if(minStack.isEmpty()==true)
       return Integer.MAX_VALUE;
   return (Integer)(minStack.peek());
  }

  public Integer pop(){
   Integer value=(Integer)super.pop();
   if(value==min()){
     minStack.pop();
   }
    return value;
  }
public static void main(String args[])
{
   C3_2  stack=new C3_2();
   stack.push(3);
   System.out.println(stack.min());
   stack.push(2);
   System.out.println(stack.min());
   stack.push(5);
   stack.push(3);
   System.out.println(stack.min());
   stack.push(1);
   System.out.println(stack.min());
   stack.push(4);
   System.out.println(stack.min());
   stack.push(0);
   System.out.println(stack.min());
   stack.push(2);
   System.out.println(stack.min());
//output, 3,2,2,2,1,1,0,0 
   stack.pop();
   System.out.println(stack.min());  
   stack.pop();
   System.out.println(stack.min());  
   stack.pop();
   System.out.println(stack.min());  
   stack.pop();
   System.out.println(stack.min());  
   stack.pop();
   System.out.println(stack.min());  
   stack.pop();
   System.out.println(stack.min());  
  //output 0,1,1,2,2,2,3
}

}
