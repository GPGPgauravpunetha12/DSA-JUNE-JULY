import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class GraphRepresentation {

    static void addEdge(ArrayList<ArrayList<Integer>> adjList, int v1, int v2) {
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);
    }

    static void print(ArrayList<ArrayList<Integer>> adjList) {
        // for (ArrayList<Integer> inner : adjList) {
        // System.out.println(inner);
        // }
        for (int i = 0; i < adjList.size(); i++) {
            String items = "";
            for (int j = 0; j < adjList.get(i).size(); j++) {
                items += adjList.get(i).get(j) + " , ";
            }
            System.out.println(i + " => " + items);
        }
    }

    static boolean isEdgeExist(int v1, int v2, ArrayList<ArrayList<Integer>> adjList) {
        ArrayList<Integer> neighbours = adjList.get(v1);
        for (Integer n : neighbours) {
            if (n == v2) {
                return true;
            }
        }
        return false;
    }

    static boolean bfs(ArrayList<ArrayList<Integer>> adjList, int start, int target) {
        boolean visited[] = new boolean[adjList.size()];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int element = queue.poll();
            if (isEdgeExist(element, target, adjList)) {
                return true;
            }
            // Explore the Neighbours and add in the queue
            for (int neighbour : adjList.get(element)) {
                if (visited[neighbour] == false) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = {
                { 0, 1, 1, 0 },
                { 1, 0, 1, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 0, 0 }
        };
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int totalVertex = 4;
        for (int i = 0; i < totalVertex; i++) {
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        print(adjList);
        boolean result = bfs(adjList, 0, 5);
        System.out.println(result ? "Found " : "Not found");
        // addEdge(adjList, 2, 0);
        // addEdge(adjList, 2, 1);
        // addEdge(adjList, 3, 1);

    }
}