import java.io.*;
import java.util.*;

public class C1_1_1 {

public boolean test_unique_string(String s){
  
  HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
  int length=s.length();
  for(int i=0;i<length;i++){
     if(hash.containsKey(s.charAt(i)))
       return false;
     else
       hash.put(s.charAt(i),1);
  }
  return true;
}

public static void main(String args[]){
    C1_1_1 test = new C1_1_1();
    for( String s: args){
      System.out.println(test.test_unique_string(s));
    }

}
}
