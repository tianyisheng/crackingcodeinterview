import java.io.*;
import java.util.*;


public class MergeSort
{
   public static void mergeSort(int []array){
   mergeSort(array, 0,array.length-1);
 
}
  
   
   public  static void mergeSort(int[]array, int low, int high){
    if(low < high) {
          int middle= (low+high)/2;
          mergeSort(array, low, middle);
          mergeSort(array,middle+1,high);
          merge(array,low,middle,high);
       }
 }

   public static void merge(int[] array, int low, int middle,int high){
   int []helper=new int [array.length];
   for(int i=low;i<=high;i++){
   helper[i]=array[i];
   }
   
   int helperLeft=low;
   int helperRight=middle+1;
   /** Iteterate through helper array, compare the left and right half,
   compying the smaller element from the two halves into the original array.
   **/
   int index=low;
   while(helperLeft<=middle&&helperRight<=high){
   if(helper[helperLeft]>helper[helperRight]) {
     array[index++]=helper[helperRight];
     helperRight++;
     }
   else{
     array[index++]=helper[helperLeft];
     helperLeft++; 
   }
   }
   
   int remaining=middle-helperLeft;
   for(int i=0;i<=remaining;i++){
     array[index+i]=helper[helperLeft+i];
   }


}


   public static void main(String args[]){
  
   int[] array= {20,5,8,22,230,10,10,12,13,120};
   for(int i=0;i<array.length;i++)
      System.out.println(array[i]);
   System.out.println("after sorting"); 
   mergeSort(array);
   for(int i=0;i<array.length;i++)
      System.out.println(array[i]);
  
   
}
} 
