
import java.util.*;

class Graph {
    int vertices;
    List<List<Integer>> adj;

    public Graph(int v) {
        this.vertices = v;

        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int s, int d) {
        adj.get(s).add(d);
        adj.get(d).add(s);
    }

    void printGraph() {
        for (int i = 0; i < this.vertices; i++) {
            System.out.print(i + "-> ");

            for (int neigh : this.adj.get(i)) {
                System.out.print(neigh + " ");
            }

            System.out.println();
        }
    }

}

public class Implement {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 3);

        g.printGraph();

        BFSTraversal(g.adj, g.vertices);

        float x = 5.0f;

        System.out.printf("%.20f%n", x);

    }

    public static void BFSTraversal(List<List<Integer>> adj, int n) {

        boolean[] visited = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();

        // Start BFS from vertex 0
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            System.out.print(node + " ");

            // Visit all neighbors
            for (int neighbor : adj.get(node)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void DFSTraversal(List<List<Integer>> adj, int n) {
        boolean[] visited = new boolean[n];

        // Start DFS from vertex 0
        DFSUtil(0, adj, visited);
    }

    public static void DFSUtil(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        // Visit all neighbors
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, adj, visited);
            }
        }
    }

}
