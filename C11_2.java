package code;
import java.io.*;
import java.util.*;

public class C11_2 {

public static String sortChars(String s){
char[] content=s.toCharArray();
Arrays.sort(content);
return new String(content);
}

public static int Compare(String tmp1,String tmp2){
  String t1=sortChars(tmp1);
  String t2=sortChars(tmp2);  
  return t1.compareTo(t2);

}

public static void swap(String arr[],int left, int right){
  String temp=arr[left];
  arr[left]=arr[right];
  arr[right]=temp;
}
public static int partition(String arr[],int left, int right){
 String pivot=arr[(left+right)/2];

 while(left<=right){
while(Compare(arr[left],pivot)<0){
left++;
}

while(Compare(arr[right],pivot)>0){
right--;
} 


if(left<=right){
swap(arr,left, right);
left++;
right--;
}

}
 return left;
} 


public static void quickSort(String arr[],int left, int right){

 int index=partition(arr, left, right);

 if(left<index-1){
 quickSort(arr,left,index-1);
 }
 
 if(index<right) {
 quickSort(arr,index,right);
}
 

}

public static void main (String[] args){

  String arr[]={"apple","banana","carrot","aba","bab","xyz","dog","odg"};
  
  for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
 System.out.println();
 quickSort(arr,0,arr.length-1);
 System.out.println("after sorting: ");
  for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
 

}
}
