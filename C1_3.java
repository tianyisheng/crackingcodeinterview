import java.util.*;
import java.io.*;

public class C1_3{
  
  public static char[] sortString(char[] array){
     Arrays.sort(array);
     return array;
  }
 public static void swap(char [] array, int left, int right){

  char temp=array[left];
 array[left]=array[right];
 array[right]=temp;
}  
 public static char[]  mergeSortR(char []array,int low, int high){
 if(low<high)
  {
   int mid=(low+high)/2;
   mergeSortR(array,low,mid);
   mergeSortR(array,mid+1,high);
   /**begin to merge**/   
   char [] helper= new char[high+1];
   for(int i=low;i<=high;i++)
         helper[i]=array[i];
   int helperLeft=low;
   int helperRight=mid+1;
   int index=low;
   while(helperLeft<=mid&&helperRight<=high){
    if(helper[helperLeft]>helper[helperRight])
      array[index++]=helper[helperRight++];
    else {
      array[index++]=helper[helperLeft++];
    }

   }
   int  remaining=mid-helperLeft;
   for(int i=0;i<=remaining;i++) {
      array[index+i]=helper[helperLeft+i];
    }
  }

 return array; 
}
  
  public static char[] mergeSort(char[] array){
  
  int low=0;
  int high=array.length-1;
  int mid=(low+high)/2;
  mergeSortR(array,low,high);
  return array;
}
  
  public static int partition(char[] array, int low, int high){
  int left=low;
  int right=high;
  int pivot=array[(left+right)/2];
  while(left<=right){
     while(pivot>array[left]){
         left++;
     }
    while(pivot<array[right]){
         right--;
    }
    if(left<=right)
    {
     swap(array,left, right);
     left++;
     right--;
    }
  }
   return left;
}  
 
  public static void quickSort(char[] array, int low, int high){
  int index= partition(array,low,high);
  if(low<index-1){
          quickSort(array,low,index-1);
      }
  if(index+1<high) {
       quickSort(array,index,high);
   } 
}
  
  public static char[] quickSort(char[] array){
  
     quickSort(array,0,array.length-1);

  return array;
}
  public static boolean compare(String stra, String strb){
  
  if(stra.length()!=strb.length()) return false;
  else {
     String tempA=new String(sortString(stra.toCharArray()));
     String tempB=new String(mergeSort(strb.toCharArray()));
     System.out.println(tempA);
     System.out.println(tempB); 
    int index=stra.length();
     while(index>0)
    {
      if(tempA.charAt(index-1)!=tempB.charAt(index-1))
          {
            return false;
          }
      index--;
    }
    return true;
  }  
  
}
  

  public static void main (String [] args){

  String stra="thisisastring";
  String strb="isastringthsi";
  System.out.println(compare(stra,strb));
}
}
