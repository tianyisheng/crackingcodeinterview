package code;
import java.io.*;

public class QuickSort {

public static void swap(int arr[],int left, int right){
  int temp=arr[left];
  arr[left]=arr[right];
  arr[right]=temp;
}
public static int partition(int arr[],int left, int right){
 int pivot=arr[(left+right)/2];

 while(left<=right){
while(arr[left]<pivot){
left++;
}

while(arr[right]>pivot){
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


public static void quickSort(int arr[],int left, int right){

 int index=partition(arr, left, right);

 if(left<index-1){
 quickSort(arr,left,index-1);
 }
 
 if(index<right) {
 quickSort(arr,index,right);
}
 

}

public static void main (String[] args){

  int arr[]={15,130,1320,123,11,10,8,-1,2,8,9,10};
 
  for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
 System.out.println();
 quickSort(arr,0,arr.length-1);
 System.out.println("after sorting: ");
  for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
 

}
}
