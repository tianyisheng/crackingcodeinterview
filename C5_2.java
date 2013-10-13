import java.io.*;
import java.util.*;

public class C5_2 {

  public static String printBinary(double num){
  double temp=0.0;
  int bit=1;
  StringBuilder answer=new StringBuilder();
  answer.append("0.");
  while(num>0&&bit<=32){
  temp=1>>bit;
  if(num>temp){
     num=num-temp;
     answer.append(1);
   }
  else{
     answer.append(0);
  }
  bit++;
 }
  
  return new String(answer);
}

  public static String printBinary2(double num){
  StringBuilder result=new StringBuilder();
  result.append("0.");
 
  while(num>0){
         
      if(result.length()>32) return "error";     

     if(num*2>1)
      {
          result.append("1");
          num=num*2-1.0;
      } else {
          result.append("0");
          num*=2;
      }
       
  }

   return result.toString();
}
  

  public static void main(String args[]){

   String bs=printBinary(0.126);
   System.out.println(bs);

   for (int i=0;i<500;i++){
    double num=i/1000.0;
    String binary=printBinary(num);
    String binary2=printBinary2(num);
    if(!binary.equals("error")||binary.equals("error"))
              System.out.println(num+":"+binary+"  "+binary2);
   }
  }  
}
