import java.io.*;
import java.util.*;

public class C1_5{

 public static String stringCompress(String target){
  int length=target.length();
  char charArray[]=target.toCharArray();
  int newLength=0;
  // being with first char
  char lastChar=charArray[0];
  char currentChar='c';
  int similarCount=0;
  newLength+=2;
 
 // for the second char
  for(int i=1;i<length;i++){
      currentChar=charArray[i];
      if(currentChar==lastChar){
        similarCount++; 
      }else
      {
         int addition=(Integer.toString(similarCount)).length();
         newLength+=(addition-1);
         similarCount=0;
         lastChar=currentChar;
         newLength+=2;
      }
  
    }
  System.out.println("new length: "+newLength);
  if(newLength>=length) return target;
  char newCharArray[]= new char[newLength]; 
  // begin to compress
  newCharArray[0]= charArray[0];
  currentChar='c';
  similarCount=1;
  int index=1;
  lastChar=charArray[0];
  for(int i=1;i<length;i++){
      currentChar=charArray[i];
      if(currentChar==lastChar){
        similarCount++; 
      }else
      {
        // newCharArray[index++]=similarCount;
         int digit=(Integer.toString(similarCount)).length();       
         for(int j=0;j<digit;j++){
             newCharArray[index++]=(Integer.toString(similarCount)).charAt(j);
         }
         newCharArray[index++]=currentChar;
         similarCount=1;
         lastChar=currentChar;
      }
  
}
//  newCharArray[index]=similarCount;
         int digit=(Integer.toString(similarCount)).length();       
         for(int j=0;j<digit;j++){
             newCharArray[index++]=(Integer.toString(similarCount)).charAt(j);
   }
  System.out.println(newCharArray);
  return new String(newCharArray);
}
 public static void main(String args[]){

 String temp= "aaabbbccccdddefefefee";
 System.out.println(temp+"| original length: "+temp.length());
 System.out.println(stringCompress(temp));
 temp= "acddbefgee";
 System.out.println(temp+"| original length: "+temp.length());
 System.out.println(stringCompress(temp));
 temp= "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccdddefefefee";
 System.out.println(temp+"| original length: "+temp.length());
 System.out.println(stringCompress(temp));
}

}
