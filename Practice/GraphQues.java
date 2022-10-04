import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class GraphQues {

    public static void bfs(ArrayList<ArrayList<Integer>> graph) {

        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] v = new boolean[graph.size()];

        queue.add(1);
        v[0] = true;
        while (queue.size() != 0) {

            int temp = queue.removeFirst();


            for (Integer i : graph.get(temp)) {
                if (!v[i]) {
                    v[i] = true;
                    queue.add(i);
                }
            }
            System.out.println(temp);

        }

    }

    public static void dfs(ArrayList<ArrayList<Integer>> graph, int vertex, boolean[] v) {

        for (Integer i : graph.get(vertex)) {

            if (!v[i]) {
                v[i] = true;
                dfs(graph, i, v);
            }
        }


    }

    public static boolean detectCycleDfs(ArrayList<ArrayList<Integer>> graph, Vertex vertex, boolean[] v) {

        boolean result = false;
        for (int i : graph.get(vertex.val)) {

            if (v[i] == true && vertex.parent != i) {
                result = true;
            } else if (vertex.parent != i) {
                v[vertex.val] = true;
                result = detectCycleDfs(graph, new Vertex(vertex.val, i), v);
                if (result == true) {
                    break;
                }
            }
        }
        return result;
    }

    public static boolean detectCycleBfs(ArrayList<ArrayList<Integer>> graph, Vertex vertex, boolean[] v) {

        LinkedList<Vertex> l = new LinkedList<>();
        boolean result = false;

        l.add(new Vertex(-1, 1));
        v[vertex.val] = true;

        while (l.size() != 0) {

            int size = l.size();
            Vertex temp = l.removeFirst();
            for (int i : graph.get(temp.val)) {
                if (v[i] == false && i != temp.parent) {
                    v[i] = true;
                    l.add(new Vertex(temp.val, i));
                } else if (v[i] == true && i != temp.parent) {
                    result = true;
                    break;
                }
            }

        }


        return result;
    }

    public static void topoSort(ArrayList<ArrayList<Integer>> graph, int vertex, boolean[] v, Stack<Integer> s) {
        v[vertex] = true;
        for (int i : graph.get(vertex)) {
            if (v[i] == false) {

                topoSort(graph, i, v, s);
            }
        }
        s.push(vertex);

    }

    public static void topoSortUtil(ArrayList<ArrayList<Integer>> graph, int n) {
        Stack<Integer> s = new Stack<>();
        boolean[] v = new boolean[graph.size()];


        for (int i = 0; i < n; i++) {
            if (v[i] == false) topoSort(graph, i, v, s);
        }
        while (s.size() != 0) {

            System.out.println(s.pop());

        }
    }

    public static void dijkstra(ArrayList<ArrayList<Edge>> graph, int n) {

        PriorityQueue<Pair> p = new PriorityQueue<>((a, b) -> a.wsf - b.wsf);

        p.add(new Pair(0, "0",0));

        boolean[] v = new boolean[graph.size()];


        while (p.size() != 0) {
            Pair temp = p.remove();
            if(v[temp.v])continue;
            v[temp.v]=true;
            System.out.println(temp.psf+" wt:"+temp.wsf);
            for (Edge i : graph.get(temp.v)) {
                if (v[i.vertex2]==false){

                    p.add(new Pair(i.vertex2, temp.psf+" "+i.vertex2,temp.wsf+i.weight));
                }
            }
        }


    }

    public static void mstPrimsAlgo(ArrayList<ArrayList<Edge>> graph, int n) {

        PriorityQueue<Pair> p = new PriorityQueue<>((a, b) -> a.wsf - b.wsf);

        p.add(new Pair(0, 0+"",0));

        boolean[] v = new boolean[graph.size()];


        while (p.size() != 0) {
            Pair temp = p.remove();

            if(v[temp.v])continue;
            v[temp.v]=true;
            System.out.println(temp.psf+" wt:"+temp.wsf);
            for (Edge i : graph.get(temp.v)) {
                if (v[i.vertex2]==false){

                    p.add(new Pair(i.vertex2, temp.psf+" "+i.vertex2 ,i.weight));
                }
            }
        }


    }



    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//
//        // adding new arraylists to 'adj' to add neighbour Edges
//        for (int i = 0; i < 6; i++) {
//            adj.add(new ArrayList<>());
//        }

//        adj.get(5).add(2);
//        adj.get(5).add(0);
//        adj.get(4).add(0);
//        adj.get(4).add(1);
//        adj.get(2).add(3);
//        adj.get(3).add(1);


//        bfs(adj);

//        System.out.println(detectCycleBfs(adj, new Vertex(-1, 1), new boolean[adj.size()]));


//        topoSortUtil(adj,6);


        int n = 5;
        ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<Edge>());

        adj.get(0).add(new Edge(0, 2,1));
        adj.get(1).add(new Edge(1, 2,0));

        adj.get(1).add(new Edge(1, 1,2));
        adj.get(2).add(new Edge(2, 1,1));

        adj.get(0).add(new Edge(0, 1,3));
        adj.get(3).add(new Edge(3, 1,0));

        adj.get(3).add(new Edge(3, 3,2));
        adj.get(2).add(new Edge(2, 3,3));

        adj.get(1).add(new Edge(1, 5,4));
        adj.get(4).add(new Edge(4, 5,1));

        adj.get(2).add(new Edge(2, 1,4));
        adj.get(4).add(new Edge(4, 1,2));

        mstPrimsAlgo(adj,adj.size());

    }


}

class Vertex {
    int parent;
    int val;

    Vertex(int parent, int val) {
        this.parent = parent;
        this.val = val;
    }
}
class Pair{

    String psf;
    int wsf;
    int v;
    public Pair(int v,String psf, int wsf ) {
        this.psf = psf;
        this.wsf = wsf;
        this.v = v;

    }


}
class Edge {

    int vertex1;
    int vertex2;
    int weight;


    Edge(int vertex1, int weight,int vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }
}