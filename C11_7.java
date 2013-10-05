import java.io.*;
import java.util.*;

public class C11_7{
public static ArrayList<HtWt> longestIncreasingSubSeq(ArrayList<HtWt> items){
   return null;

}


public static void printList(ArrayList<HtWt> items){

    for(HtWt temp: items){
    System.out.print(temp.toString()+" ");  
   }
    System.out.println();
}

   public static void main(String args[]){
   
   ArrayList<HtWt> items=new ArrayList<HtWt>();
   HtWt item = new HtWt(65, 60);
                items.add(item);
               
                item = new HtWt(70, 150);
                items.add(item);
               
                item = new HtWt(56, 90);
                items.add(item);
               
                item = new HtWt(75, 190);
                items.add(item);
               
                item = new HtWt(60, 95);
                items.add(item);
               
                item = new HtWt(68, 110);
                items.add(item);
               
                item = new HtWt(35, 65);
                items.add(item);
               
                item = new HtWt(40, 60);
                items.add(item);
               
                item = new HtWt(45, 63);
                items.add(item);
   printList(items);
   Collections.sort(items);
   printList(items);
   ArrayList<HtWt> solution= longestIncreasingSubSeq(items);
   printList(solution);  
 }
}

class HtWt implements Comparable
{
   public HtWt(int height,int weight){
   this.weight=weight;
   this.height=height;  
}
  public String toString(){
      String temp="( "+this.weight+","+this.height+" )";
      return temp;
  }
  public int compareTo(Object s){
      HtWt second =(HtWt)s;
      if(this.height!=second.height){
          return ((Integer)this.height).compareTo(second.height);
         }else {
          return ((Integer)this.weight).compareTo(second.weight);
       }
   
  }
   public int height;
   public int weight;
   
}
