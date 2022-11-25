package MTPD_EyOD;

/*
* ITESS_TICS
*MPTD y EyOD
*Agosto-Diciembre 2022
*Martin Arreguin Molina
*24//11/2022
 */
public class Graph {

    private final int NUM_VERTEX_MAX = 100;
    private int[] vertex;
    private int numVertex;
    private int[][] edge;
    private int numEdge;

    public Graph() {
        init();
    }

    public Graph(int vertex) {
        init();
        setVertex(vertex);
    }

    private void init() {
        vertex = new int[NUM_VERTEX_MAX];
        edge = new int[NUM_VERTEX_MAX][2];

    }

    public void setVertex(int numVertex) {
        for (int i = 0; i < numVertex; i++) 
            this.vertex[i] = i;
        

        this.numVertex = numVertex;
    }

    public void setEdge(int i, int j) {
        this.edge[numEdge][0] = i;
        this.edge[numEdge][1] = j;

        numEdge++;
    }

    public String toString() {
        String out = "Graph ---------\n";

        out += "vertices : [";

        for (int i = 0; i < numVertex; i++) {
            out += i + ", ";
        }

        out += "edges : [";

        for (int i = 0; i < numEdge; i++) {
            out += "(" + edge[i][0] + ", " + edge[i][1] + "), ";
        }

        out += "]\n";

        return out;
    }

}
