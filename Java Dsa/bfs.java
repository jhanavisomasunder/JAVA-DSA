import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    static void bfs(int start, ArrayList<ArrayList<Integer>> graph, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 7;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // add edges
        graph.get(0).add(5);
        graph.get(0).add(1);
        graph.get(0).add(4);
        graph.get(0).add(3);
        graph.get(0).add(2);

        bfs(0, graph, n);  // start BFS from node 0
    }
}
