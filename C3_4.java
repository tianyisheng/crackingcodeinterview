import java.io.*;
import java.util.*;
public class C3_4{

public void moveAll(Tower source, int n,Tower via, Tower dest){
/**move the first n plates from source to dest via "via, where "via" should be empty **/
  if(n==1) {
     this.move(source,dest); 
  } 
  else
 {
  this.moveAll(source,n-1, dest,via);
  this.move(source,dest);
  this.moveAll(via,n-1,source,dest);
 }
}

public boolean move(Tower source, Tower dest){
/**move a plate from "source" to dest tower"" **/
if(dest.empty()==false&&source.peek()>dest.peek()) 
    return false;
Plate temp=source.pop();
dest.add(temp);
System.out.println("move plate:  "+temp.data+" from Tower "+source.name+" to "+dest.name);
return true;
}


public static void main(String args[]){
  int n=3;// three towers;
  int m=3; //number of plate

  Tower towers[]=new Tower[n];
  for(int i=0;i<3;i++){
      towers[i]=new Tower(i);
  }
  
  Plate plates[]=new Plate[m];
 for(int i=0;i<m;i++){   
     plates[i]=new Plate(i);
  }
  for(int i=m-1;i>=0;i--){
     towers[0].add(plates[i]);
  }
  C3_4 example=new C3_4();
  example.moveAll(towers[0],m,towers[1],towers[2]);//move plates from tower 0 to tower 2, via tower 1.
  
}

}



class Tower{
 int name;
 public Tower(int n){
 this.name=n;
}
 Stack plates=new Stack();
 
 public void add(Plate data){
   plates.push(data);
} 
 public int peek(){
  if (plates.empty())
       return Integer.MIN_VALUE;
  return ((Plate) plates.peek()).data;
  }

 public Plate pop(){
  return (Plate)plates.pop();
 }
 
  public boolean empty(){
   return plates.empty();
  }
}

class Plate{
public int data;
 
 public Plate(int n)
{  this.data=n;
}
}
