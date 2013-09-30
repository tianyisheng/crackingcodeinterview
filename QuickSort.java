public QuickSort{

void quickSort(int arr[], int left, int right){
  int index= partition(arr,left,right)
  if(left<index-1) {
    quickSort(arr,left,index-1);
  }
  if(index<right) {
  quickSort(arr,index,right);
  }
  
}
  int partition(int arr[],int left, int right) {
  int pivot =arr[(left+right)/2];
  while(left<=right){
       while(arr[left]<pivot)left++;
       while(arr[right]>pivot)right++;
  //swap elements, and move left and right indices;
  if(left<=right){
  swap(arr,left,right);
  left++;
  right--;
  }
  }

  return left;//
}

public void swap(int arr[],int left,int right){
int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
}



 public static void main(String args[]){
   int[] array= {20,5,8,22,230,10,10,12,13,120};
   for(int i=0;i<array.length;i++)
      System.out.println(array[i]);
   System.out.println("after sorting"); 
   quickSort(array);
   for(int i=0;i<array.length;i++)
      System.out.println(array[i]);
  
   
}

}
