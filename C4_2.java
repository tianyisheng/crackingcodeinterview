import java.util.*;
import java.io.*;
import CrackingCodeLibrary.*;

public class C4_2{

 public static boolean search(Graph g, GraphNode start, GraphNode end)
{
   LinkedList<GraphNode> q =new LinkedList<GraphNode>();
   for( GraphNode u:g.getGraphNodes()){
     u.state=GraphNode.State.Unvisited;     
  }
   
   start.state=GraphNode.State.Visiting;
   q.add(start);
   GraphNode u;
   while(!q.isEmpty()){
   u=q.removeFirst();
   if(u!=null) {
    
        for(GraphNode v: u.getAdjacent()){
          if(v.state==GraphNode.State.Unvisited){
                if(v==end){
                       return true;
                  } else {

                    v.state=GraphNode.State.Visiting;
                    q.add(v);
                  }
           }       
 
         }
    }
    u.state=GraphNode.State.Visited;

   }
   return false;

}   

 public static void main(String args[]){
   Graph g =createNewGraph(6);
   GraphNode[] n=g.getGraphNodes();
   GraphNode start =n[3];
   GraphNode end =n[5];
   System.out.println(search(g,start,end));

}

  public static Graph createNewGraph(int num)
{
   Graph g = new Graph(num);
   GraphNode[] temp = new GraphNode[6];
   temp[0] =new  GraphNode("a",3);
   temp[1]=new GraphNode("b",0);
   temp[2]= new GraphNode("c",0);
   temp[3]=new GraphNode("d",1);
   temp[4]=new GraphNode("e",1);
   temp[5]=new GraphNode("f",0);

   temp[0].addAdjacent(temp[1]);
   temp[0].addAdjacent(temp[2]);
   temp[0].addAdjacent(temp[3]);
   temp[3].addAdjacent(temp[4]);
   temp[4].addAdjacent(temp[5]);

   for(int i=0;i<6;i++){
      g.addGraphNode(temp[i]);
   }
return g;
}


}
