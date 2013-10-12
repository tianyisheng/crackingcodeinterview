import java.io.*;
import java.util.*;


public class GoldPot{


  
   public static void main(String args[])
  {
     int line[]={12,60,28,4};
     int length=4;   
  
     /**optimal stragety for the sub-line policy[x][y]],
      x means the starting index, y is the length;
      0 means left, 1 means right
     **/     
     int policy[][]=new int [length][length+1];
     int result[][]=new int [length][length+1];
     int sum[][]=new int [length][length+1];
    /**initialize**/
    
    for(int i=0;i<length;i++)// fixed the length=1
               {
                 policy[i][1]=0;
                 result[i][1]=line[i];
               }
    for(int i=0;i<length;i++)// fixed the length=1
               {
                 sum[i][1]=line[i];
                 sum[i][0]=0;
               }
     
     for(int i=0;i<length;i++)
       for(int j=1;j<length+1-i;j++)
             {
               sum[i][j]=sum[i][j-1]+line[i+j-1];
              System.out.println("smu["+i+"]["+j+"] :"+sum[i][j]); 
             }
   /**
   updating rule, 
    
         result[i][j]= max(line[i]+sum[i][j]-result[i+1][j-1],line[i+j-1]+sum[i][j]-result[i][j-1]);
   **/
     for(int j=2;j<length+1;j++)/**by length **/
      for(int i=0;i<=length-j;i++){  /** index of  **/
             int Left=line[i]+sum[i+1][j-1]-result[i+1][j-1];
             int Right=line[i+j-1]+sum[i][j-1]-result[i][j-1];
             if(Left>Right)
               {
                    result[i][j]=Left; 
                    policy[i][j]=0;
               }
              else {
                   result[i][j]=Right;
                   policy[i][j]=1;
               }
         }

   System.out.println(policy[0][length]);
   System.out.println(result[0][length]);
   System.out.println(sum[0][length]);
}

}
