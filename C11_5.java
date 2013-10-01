import java.io.*;
import java.util.*;

public class C11_5{

public static int search(String[] strings,String target){
    int low=0;
    int high=strings.length-1;
    int middle=(low+high)/2;
    int temp=0;
    while(low<=high){
        middle=(low+high)/2;
        temp=middle;
        while(middle>=low&&strings[middle].equals("")){
        middle--;
        }    
         
        while(middle<=high&&strings[middle].equals("")){
        middle++;
        } 
        if(strings[middle].equals(""))return -1;         
        
        if(strings[middle].compareTo(target)<0) {
           if(middle>temp)
               low=middle+1;
           else
               low=temp+1;
        } else if (strings[middle].compareTo(target)>0) {
            if(middle<temp)
                high=middle-1;
            else
                high=temp-1;     
        }else {
         return middle; 
        }      
  }
  return -1;
}


public static int searchR(String[]strings, String target,int low, int high){
 if(low==high){
   if(target.equals(strings[low]))
       return low;
   else 
      return -1;
  }
  
 int middle=(low+high)/2;
  int temp=middle;
  while(middle>=low&&strings[middle].equals("")){
        middle--;
  }    
         
 while(middle<=high&&strings[middle].equals("")){
        middle++;
  } 
  if(target.compareTo(strings[middle])==0) {
      return middle;
  }else if(target.compareTo(strings[middle])<0){
      if(middle>temp)
           middle=temp;
      return searchR(strings,target,low,middle-1);
  } else   {
    if(middle<temp)
         middle=temp;
     return searchR(strings,target,middle+1,high);
  }
}


public static void main(String args[]){

   String[] stringList={"apple","","banana","","","","carrot","duck","","","eel","","flower"};
   System.out.println(search(stringList,"l"));
   System.out.println(searchR(stringList,"apple",0,stringList.length-1));
   System.out.println(searchR(stringList,"flower",0,stringList.length-1));
   System.out.println(searchR(stringList,"eel",0,stringList.length-1));
}

}
