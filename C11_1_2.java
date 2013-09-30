import java.io.*;

class C11_1_2 {

 public static void  merge_two(int arr1[], int len1,int arr2[],int len2){
   int helperLeft=len1-1;
   int helperRight=len2-1;
   int index=len1+len2-1;  
 
   while(helperLeft>=0&&helperRight>=0){
   if(arr2[helperRight]>arr1[helperLeft])
      arr1[index--]=arr2[helperRight--];
   else
      arr1[index--]=arr1[helperLeft--];
  }
  
   while(helperRight>=0){
      arr1[index--]=arr2[helperRight--];
   }
}  


  public static void main(String [] args){
  int arrs1 []={1,3,5,7,9,11,0,0,0,0,0,0,0};
  int arrs2[]={2,4,6,8,10,19,21};

  merge_two(arrs1,6,arrs2,7);
  for(int i=0;i<6+arrs2.length;i++)
  System.out.print(arrs1[i]+" ");
 
  System.out.println();
}

  
}
