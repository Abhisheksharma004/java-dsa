import java.util.*;

class Edge implements Comparable<Edge> {
    int source, destination, weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge otherEdge) {
        return this.weight - otherEdge.weight;
    }
}

class UnionFind {
    int[] parent, rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int u) {
        if (parent[u] != u) {
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }

    public void union(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);

        if (rootU != rootV) {
            if (rank[rootU] > rank[rootV]) {
                parent[rootV] = rootU;
            } else if (rank[rootU] < rank[rootV]) {
                parent[rootU] = rootV;
            } else {
                parent[rootV] = rootU;
                rank[rootU]++;
            }
        }
    }
}

public class KruskalMST {

    public static List<Edge> kruskalMST(int vertices, List<Edge> edges) {
        Collections.sort(edges);

        UnionFind uf = new UnionFind(vertices);
        List<Edge> mst = new ArrayList<>();

        int totalWeight = 0;

        for (Edge edge : edges) {
            int rootU = uf.find(edge.source);
            int rootV = uf.find(edge.destination);

            if (rootU != rootV) {
                mst.add(edge);
                totalWeight += edge.weight;
                uf.union(edge.source, edge.destination);
            }
        }

        System.out.println("Total weight of the MST: " + totalWeight);
        return mst;
    }

    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 4));
        edges.add(new Edge(0, 2, 4));
        edges.add(new Edge(1, 2, 2));
        edges.add(new Edge(1, 3, 6));
        edges.add(new Edge(2, 3, 8));
        edges.add(new Edge(2, 4, 9));
        edges.add(new Edge(3, 4, 10));
        edges.add(new Edge(3, 5, 5));
        edges.add(new Edge(4, 5, 7));

        int vertices = 6;

        List<Edge> mst = kruskalMST(vertices, edges);

        System.out.println("Edges in the Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.source + " - " + edge.destination + " : " + edge.weight);
        }
    }
}
