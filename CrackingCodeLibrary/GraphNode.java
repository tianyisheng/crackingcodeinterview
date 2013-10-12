package CrackingCodeLibrary;
public class GraphNode {
    public static enum State{ Visiting, Visited, Unvisited;}
    private GraphNode adjacent[];
    public int adjacentCount;
    private String vertex;
    public State state;
    public GraphNode(String vertex, int adjacentLength) {
        this.vertex = vertex;                
        adjacentCount = 0;        
        adjacent = new GraphNode[adjacentLength];
    }
   
    public void addAdjacent(GraphNode x) {
        if (adjacentCount < 30) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.print("No more adjacent can be added");
        }
    }
    public GraphNode[] getAdjacent() {
        return adjacent;
    }
    public String getVertex() {
        return vertex;
    }
}


