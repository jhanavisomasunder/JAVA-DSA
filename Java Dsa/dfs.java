import java.util.*;
public class dfs {   // boolean[]visited to backtracking to visit that elemnt and come back
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj, boolean[]visited){
     visited[node]=true; // if we have visted that elemnt 
     System.out.println(node+" ");
     //check the neigbours of the node
     for(int neighbor: adj.get(node)){
//not visited
        if(!visited[neighbor]){
            // visit the neighbour
            dfs(neighbor,adj,visited);
        }
        }
    
    }
    public static void main(String[] args) {
        int n=7;
        //int a = new int(n)
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }
        //add edges
        // when the graph is unvisited
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);               
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(0);
        graph.get(2).add(5);
        graph.get(3).add(1);
        graph.get(4).add(1);
        graph.get(5).add(2);
        /*0
         / \
         1  2       the graph is like this 
         /\  \
         3 4  5 */
        // when graph is visited
        boolean[] visited =new boolean[n];
        dfs(0,graph,visited);

    }
    
}
