import java.io.*;
import java.util.*;

public class C11_2_2 {

public static String sortChar(String temp){
   char[] array=temp.toCharArray();
   Arrays.sort(array);
   return new String(array);
}

public static void sort(String []arr){
HashMap<String,LinkedList<String>> hash=new HashMap<String,LinkedList<String>>();

 for(int i=0;i<arr.length;i++){
    String temp=sortChar(arr[i]);
    if(hash.containsKey(temp)){
      LinkedList<String> list= hash.get(temp);
      list.push(arr[i]);
     }
    else {
      LinkedList<String> tempList=new LinkedList<String>();
      tempList.push(arr[i]);
      hash.put(temp,tempList);
     } 
   }

  // begin to print the hashtable;
  LinkedList<String> tmp;
  int index=0;
  for(String key: hash.keySet()){
     tmp=hash.get(key);
     for(String anagram:tmp) {
     arr[index++]=anagram;  
  }
}

}

public static void main (String[] args){

  String arr[]={"apple","banana","carrot","aba","bab","xyz","dog","odg"};
  
  for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
 System.out.println();
 sort(arr);
 System.out.println("after sorting: ");
  for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
 
}

} 
