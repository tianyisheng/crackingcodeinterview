import java.io.*;
import java.util.*;


public class C11_3 {
 
public static  int find(int arr[], int target,int low, int high)
 {
     int mid=(low+high)/2; 
  if(target==arr[mid])
    {
      return mid;
    }  
  if(low<high) {
     int midValue=arr[(low+high)/2];
    System.out.println("find between: ["+arr[low]+"] , ["+arr[high]+"]");  
    System.out.println(" mid value= "+arr[mid]); 
    if(arrow[low]<=arrow[mid]){
       
        return find(arr,target,mid+1,high);
       }   
  else
        if(arrow[low] 

   
     else if(target>midValue&& arr[high]<midValue)
       return find(arr,target,low,mid-1);   
  
     else if(target<midValue&&target>arr[high])
       return find(arr,target,low,mid-1);
     else if(target<midValue&&target<=arr[high])
       return find(arr,target,mid+1,high);
     }
  return -1;
 } 


public static void main(String args[]){

  int rotatedArray[]={17,19,21,23,102,205,1,5,9,10,13,15};
  int target=17;
  System.out.println("find index of " +target+" : among 17,19,21,23,102,205,1,5,9,10,13,15");
   System.out.println("Answer is : "+find(rotatedArray,target,0,rotatedArray.length-1));
}

}
