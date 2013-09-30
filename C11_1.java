import java.io.*;
public class C11_1{
   
public static void merge_two(int arr1[], int length, int arr2[]){
   
   int helper[]=new int[arr1.length];
   for(int i=0;i<arr1.length;i++)
      helper[i]=arr1[i];
  int helperLeft=0;
  int helperRight=0;
  int index=0;
  while(helperLeft<length&&helperRight<arr2.length){
  if(helper[helperLeft]<arr2[helperRight]){
     arr1[index++]=helper[helperLeft++];
    }
  else
    {
     arr1[index++]=arr2[helperRight++];
    }
}
  
  while(helperLeft<length) {//copy the remaining on arr1.
  arr1[index++]=helper[helperLeft++];
  }
  while(helperRight<arr2.length) {// copy the remaining on arr2.
  arr1[index++]=arr2[helperRight++];
  }

}

public static void main(String[] args){

  int arr1[]={2,4,6,8,10,11,13,15,0,0,0,0,0,0,0,0,0};
  int arr2[]={1,3,5,17};
  merge_two(arr1,8,arr2);
  for(int i=0;i<8+arr2.length;i++)
  System.out.print(arr1[i]+" ");
 
  System.out.println();
}


}
