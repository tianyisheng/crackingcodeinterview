import java.io.*;
import java.util.*;

public class IslandProb{

static   int N=10;
  
  public static double probability(int x,int y,int n)
{ 
   double prob[][][]=new double [N][N][n];
   /**
     initialize 
   **/ 
   for(int i=0;i<N;i++)
     for(int j=0;j<N;j++)
        {
            prob[i][j][0]=1.0;
        }

   for(int i=1;i<n;i++)
    for(int p=0;p<N;p++)
      for(int q=0;q<N;q++)
     {
        double temp=0;
      // left, right, up, down

       if(p-1>=0)
          temp+=prob[p-1][q][i-1];
       if(p+1<N)
          temp+=prob[p+1][q][i-1];
       if(q-1>=0)
          temp+=prob[p][q-1][i-1];
       if(q+1<N)
          temp+=prob[p][q+1][i-1]; 
        
       prob[p][q][i]=temp/4.0;
     }
   return prob[x][y][n-1];
}  

  public static void main(String args []){
  
    int x=3;
    int y=4;
    int n=5;
     
   System.out.println(probability(3,4,5)); 
}
 
}
