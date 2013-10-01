package code;

public class QuickSort<T extends Comparable<T>>{

public void swap(T[] arr, int e1,int e2){
 T temp=arr[e1];
 arr[e1]=arr[e2];
 arr[e2]=temp;
}
 
 public void quickSort(T[] arr){
  quickSort(arr,int 0, int arr.length-1);
}

public void quickSort(T[] arr, int left, int right){
    int index=partition(arr,left,right);
    if(left<(index-1))
      {
        quickSort(arr,left,index-1);
      } 
   if(index<right)
       quickSort(arr,index,right);
  }
}

public int partition(T[] arr,int left,int right){
   int middle=(left+right)/2;
   T pivot=arr[middle];
   int low=left;
   int high=right;
   while(low<=high)
   {
    while(pivot.compareTo(arr[low])<0)
         low++;
    while(pivot.compareTo(arr[high])>0)
         high--;
    if(low<=high){
    swap(arr,low,high);
    low++;
    high--;
    }
    return low;
   }

   return low;   
}



}
