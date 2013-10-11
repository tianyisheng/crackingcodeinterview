import java.util.*;
public class C3_6{
  public static Stack<Integer> sort(Stack<Integer> s){
  Stack<Integer> temp = new Stack<Integer>();
  
  while(s.empty()==false){
  int e=s.pop();
   System.out.println("pop e from stack s : "+e); 
    while(temp.empty()==false&&e<temp.peek())
    {
      int t=temp.pop();
      s.push(t);
    }
    temp.push(e);
  }
  return temp;
  

}
  
     public static void main(String [] args) {
                Stack<Integer> s = new Stack<Integer>();
                s.push(3);
                s.push(2);
                s.push(24);
                s.push(34);
                s.push(19);
                s.push(3);
                s.push(4);
                s = sort(s);
                while(!s.isEmpty()) {
                        System.out.println(s.pop());
                }
        }

}
