import CrackingCodeLibrary.*;
import java.io.*;

public class C5_1 {

public static int updateBits(int a,int b, int first, int last){
   /** insert b into a, between first and last **/  
  if(first>=32||first>last)
         return 0;

  int allOnes= ~0;
  int mask1= (allOnes<<(last+1));
  int mask2= (1<<(first))-1;
  int mask= mask1|mask2;
 
  int aMasked= a&mask;
  int bMasked= b<<first;

return aMasked|bMasked;
 
    
}

  public static void main(String args[])
{
   int a=103217;
   System.out.println(BitManipulation.toFullBinaryString(a));
   int b=13;
   
   System.out.println(BitManipulation.toFullBinaryString(b));
   int c =updateBits(a,b,4,12);
   
   System.out.println(BitManipulation.toFullBinaryString(c));

}

}
