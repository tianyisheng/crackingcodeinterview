package CrackingCodeLibrary;
public class Graph {
        private GraphNode vertices[];
        public int count;
        public Graph(int nodeNum) {
                vertices = new GraphNode[nodeNum];
                count = 0;
    }
       
    public void addGraphNode(GraphNode x) {
                if (count < 30) {
                        vertices[count] = x;
                        count++;
                } else {
                        System.out.print("Graph full");
                }
    }
   
    public GraphNode[] getGraphNodes() {
        return vertices;
    }
}


