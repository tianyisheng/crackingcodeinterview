import java.io.*;
import java.util.*;
public class C1_7{


 public static void printMatrix(int matrix[][],int m, int n){
 
    for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
         {
          System.out.printf("%2d ",matrix[i][j]);  
         }
          System.out.println();
      }
}
  public static void markMatrix(int [][]matrix,int m, int n)
{
   boolean rows[]=new boolean[m];
   boolean clmn []=new boolean[n];
   for(int i=0;i<m;i++)
    {
       for(int j=0;j<n;j++) 
        {
          if(matrix[i][j]==0){
           rows[i]=true;
           clmn[j]=true;
             }
        }
    }

    
   for(int i=0;i<m;i++)
    {
       for(int j=0;j<n;j++) 
        {
          if(rows[i]==true){
             matrix[i][j]=0;
        }
     }
   }
   for(int i=0;i<n;i++)
    {
       for(int j=0;j<m;j++) 
        {
          if(clmn[i]==true){
             matrix[j][i]=0;
        }
     }
   }


 }
  public static void markMatrix2(int [][]matrix,int m, int n)
{
   ArrayList<Integer> rows=new ArrayList<Integer>();
   ArrayList<Integer> column=new ArrayList<Integer>();
   for(int i=0;i<m;i++)
    {
       for(int j=0;j<n;j++) 
        {
          if(matrix[i][j]==0){
             rows.add(i);
           }   
        }
    }
   for(int i=0;i<m;i++)
    {
       for(int j=0;j<n;j++) 
        {
          if(matrix[i][j]==0){
             column.add(j);
           }   
        }
    }

  for( int i: rows)
  {
     for(int j=0;j<n;j++)
          matrix[i][j]=0;
  }
  for( int j: column)
  {
     for(int i=0;i<m;i++)
         matrix[i][j]=0;
  }
}
  public static void main (String args[]){

   int matrix[][]={ {2,3,4,5,6}, {1,3,5,6,7},{0,1,5,0,2},{0,2,3,4,5}};
   printMatrix(matrix,4,5);
   System.out.println("After mark:");
   markMatrix(matrix,4,5);
   printMatrix(matrix,4,5);
   System.out.println("After mark:");
   int matrix2[][]={ {2,3,4,5,6}, {1,3,5,6,7},{0,1,5,0,2},{0,2,3,4,5}};
   markMatrix2(matrix2,4,5); 
   printMatrix(matrix2,4,5);
}

}
