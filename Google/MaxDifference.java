import java.io.*;
import java.util.*;

public class MaxDifference{

public static int computeMaxDiff(int arrs[]){
   
    int length=arrs.length;
    int maxBufferL[]=new int[length];// from left to right
    int minBufferL[]=new int[length];// from left to right;
    
    int maxBufferR[]=new int[length];// from right to left
    int minBufferR[]=new int[length];// from right to left;

    for(int i=0;i<length;i++)
   {
      maxBufferL[i]=0;
      maxBufferR[i]=0;
      minBufferL[i]=0;
      minBufferR[i]=0;
   } 

   maxBufferL[0]=arrs[0];
   minBufferL[0]=arrs[0];
   for(int i=1;i<length;i++)
   { 
      maxBufferL[i]=(arrs[i]>(arrs[i]+maxBufferL[i-1])?arrs[i]:arrs[i]+maxBufferL[i-1]);
      minBufferL[i]=(arrs[i]<(arrs[i]+minBufferL[i-1])?arrs[i]:arrs[i]+minBufferL[i-1]);
   } 
   maxBufferR[length-1]=arrs[length-1];
   minBufferR[length-1]=arrs[length-1];
   for(int i=length-2;i>=0;i--)
   { 
      maxBufferR[i]=(arrs[i]>(arrs[i]+maxBufferR[i+1])?arrs[i]:arrs[i]+maxBufferR[i+1]);
      minBufferR[i]=(arrs[i]<(arrs[i]+minBufferR[i+1])?arrs[i]:arrs[i]+minBufferR[i+1]);
   } 

 // begin to buffer each minimu by far;

   for(int i=1;i<length;i++)
   {
     maxBufferL[i]= (maxBufferL[i]>maxBufferL[i-1]?maxBufferL[i]:maxBufferL[i-1]);
     minBufferL[i]=(minBufferL[i]<minBufferL[i-1]?minBufferL[i]:minBufferL[i-1]);
   }
   
   for(int i=length-2;i>=0;i--){
   maxBufferR[i]=(maxBufferR[i]>maxBufferR[i+1]?maxBufferR[i]:maxBufferR[i+1]);
   minBufferR[i]=(minBufferR[i]<minBufferR[i+1]?minBufferR[i]:minBufferR[i+1]);
  
   
  }

   int temp1, temp2,maxDiff=0;

   for(int i=0;i<length-1;i++) {  /** left side k<=i. right side k>i **/
    System.out.print(maxBufferL[i] +","+ minBufferR[i+1]+" | " );
    
    System.out.println(maxBufferR[i+1]+"," + minBufferL[i] );
     temp1=maxBufferL[i]-minBufferR[i+1];
     temp2=maxBufferR[i+1]-minBufferL[i];
    if(temp1>maxDiff)
          maxDiff=temp1;
    if(temp2>maxDiff)
          maxDiff=temp2;
   }
   return maxDiff;
}



public static void main(String args[]){

   int arrays[]={2,-1,-2,1,-4,2,8};
   System.out.println(computeMaxDiff(arrays));
  }
}
