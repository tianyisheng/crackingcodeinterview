package code;
import java.io.*;
public class BinarySearch{
public static int BinarySearch(int arr[],int target){
   int low=0;
   int high=arr.length-1;
   int mid=(low+high)/2;
   while(low<=high){
   mid=(low+high)/2; 
   if(target>arr[mid]) low=mid+1;
   else if(target<arr[mid]) high=mid-1;
   else return mid;
  }
 return -1;
}
  
public static int BinarySearchRecursive(int arr[],int left, int right,int target){
  if (left==right&&arr[left]!=target)
    {
           return -1;
    } 
  int mid=(left+right)/2;
  if(target==arr[mid]) return mid;
  else if(target>arr[mid]) 
       return BinarySearchRecursive(arr,mid+1,right,target);
  else return BinarySearchRecursive(arr,left,mid-1,target);
 
}
public static void main (String[] args){

  int arr[]={15,130,1320,123,11,10,8,-1,2,8,9,10};
 
  for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
 System.out.println();
 QuickSort instance=new QuickSort();
 instance.quickSort(arr,0,arr.length-1);
 System.out.println("after sorting: ");
  for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
 int target=130;
 System.out.println("\n"+"search for "+target);
 System.out.println(BinarySearch(arr,target));
 System.out.println(BinarySearchRecursive(arr,0,arr.length-1,target));
}
}
