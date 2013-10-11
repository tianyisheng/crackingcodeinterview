import java.io.*;
import java.util.*;

public class C3_1{
  
  static int stackSize=30;
  static int array[]=new int[stackSize];
  static int pointer[]={-1,-1,-1}; 

public static  boolean push(int index, int value){
    int position=index*10+pointer[index]+1;
    if(pointer[index]>9) 
         return false;
    pointer[index]+=1;
    array[position]=value;
  return true;
}
 public static  int pop(int index)
{        
    int position=index*10+pointer[index];
    if(pointer[index]<0)
      return -1;
    pointer[index]--;
      return array[position];
}

public static  int peek(int index)
{
    if(pointer[index]<0)
      return -1;
   int position=index*10+pointer[index];
    return array[position];
}
 
  public static void main(String args[]){
  
  push(2,4);
  System.out.println("peek 2 :"+peek(2));
  push(0,3);
  push(0,7);
  push(0,5);
  System.out.println("peek 0:"+peek(0));
  pop(0);
  System.out.println("peek 0:"+peek(0));
  pop(0);
  System.out.println("peek 0:"+peek(0));
  pop(0);
  System.out.println("peek 0 again:"+peek(0));
  
  push(1,5);
  push(1,6); 
  System.out.println("peek 1:"+peek(1));
  pop(1);
  System.out.println("peek 1:"+peek(1));
}
}
