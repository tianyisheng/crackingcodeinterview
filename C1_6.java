import java.io.*;
import java.util.*;

public class C1_6{

 public static void printMatrix(int matrix[][],int n){
 
    for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
         {
          System.out.printf("%2d ",matrix[i][j]);  
         }
          System.out.println();
      }
}

 public static int [][] rotate(int matrix[][],int n){
    int size=n-1;
   for(int i=0;i<n/2;i++) { // index of row
       int offset=n-i-1;
       for(int j=i;j<offset;j++){//index of column
         int temp=matrix[i][j];
         matrix[i][j]=matrix[n-1-j][i];
         matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
         matrix[n-i-1][n-1-j]=matrix[j][n-1-i];
         matrix[j][n-1-i]=temp;
       }

   }
   return matrix;
}

 public static void main(String args[]){
 int matrix[][]={ {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

 printMatrix(matrix,5);
 System.out.println("After rotating 90 degree");
 printMatrix(rotate(matrix,5),5);
}
  
}
