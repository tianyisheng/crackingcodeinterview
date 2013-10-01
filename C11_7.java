import java.io.*;
import java.util.*;

public class C11_7{


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
    for(HtWt temp: items){
    System.out.print(temp.toString()+" ");  
   }
    System.out.println();

   QuickSort(items);
 }
}

class HtWt
{
   public HtWt(int height,int weight){
   this.weight=weight;
   this.height=height;  
}
  public String toString(){
      String temp="( "+this.weight+","+this.height+" )";
      return temp;
  }
   public int height;
   public int weight;
   
}
