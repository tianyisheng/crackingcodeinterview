import java.io.*;
import java.util.*;

public class GridPrint{

static class Position {
 int x;
 int y;
}

/** only work for lower case **/
public static Position findPosition(char m,int width)
{
   if(m<'a'||m>'z')
       return null;
   Position temp =new Position();
   int distance= (int)(m-'a');
   temp.x= distance%width;
   temp.y=distance/width;
 
   return temp;  
}

/**find path from p to q **/
public static void findPath(Position p, Position q)
{
  if(p==null||q==null)
    return ;
 
  // frist go up or down
   if(p.x>q.x)//go up
    {
      for(int i=0;i<p.x-q.x;i++) {
       System.out.println("l");
      }
    }
    else// down
    {
     for(int i=0;i<q.x-p.x;i++){
       System.out.println("r");
      }
   }

   // then go left or right;

   if(p.y>q.y)
   {
     for(int i=0;i<p.y-q.y;i++){
       System.out.println("u");
      }
   }else {

     for(int i=0;i<q.y-p.y;i++){
       System.out.println("d");
   }
}

}

  public static void findPath(String name,int width)
{
   if(name==null||width<=0)
       return;
  String lowerName = name.toLowerCase();
   char names[]=lowerName.toCharArray();
   

   findPath(findPosition('a',width),findPosition(names[0],width));
 
     System.out.println("!");
  for(int i=0;i<names.length-1;i++)
  {

     findPath(findPosition(names[i],width),findPosition(names[i+1],width));
     System.out.println("!");
  }
 
}


   public static void main(String args[]){

   String name="up";
   findPath(name,5);

}

}
