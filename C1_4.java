import java.io.*;
import java.util.*;

public class C1_4 {

public static String replace(String temp){
/** replace blank with "%20"
**/
   char [] charArray=temp.toCharArray();
   int blankCount=0;
   for(int i=0;i<charArray.length;i++){
      if(charArray[i]==' ') blankCount++;
   }
   int length=charArray.length+3*blankCount;
   char tempArray[]=new char[length];
   int index=0;
   for(int i=0;i<charArray.length;i++){
      if(charArray[i]==' ') {
          tempArray[index++]='%';
          tempArray[index++]='2';
          tempArray[index++]='0';
      }
      else
          tempArray[index++]=charArray[i];
   }

   return new String(tempArray);
}
public static void main(String args[]){
   String temp="ad b e f g ";
   System.out.println("\""+replace(temp)+"\"");
}

}
