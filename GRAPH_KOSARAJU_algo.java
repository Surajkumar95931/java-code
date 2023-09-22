package apna_college;

import java.util.*;
import java.util.Stack;

public class GRAPH_KOSARAJU_algo {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        createGraph(graph);
        kosaRaju(graph, v);
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
//        graph[4].add(new Edge(4, 5));
//        graph[5].add(new Edge(5, 3));
    }

    public static void kosaRaju(ArrayList<Edge>[] graph, int v) {
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        ArrayList<Edge>[] transpose = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        // Construct the transpose of the graph
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Now perform DFS on the transpose to find SCCs
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                System.out.print("SCC: ");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }
}