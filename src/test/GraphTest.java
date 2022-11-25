package test;

import MTPD_EyOD.Graph;

public class GraphTest {

    public static void main(String... args) {
        System.out.println("Graph defautl constructor --------------");
        Graph defaultGraph = new Graph();
        System.out.println(defaultGraph.toString());
        
        defaultGraph.setVertex(3);
        System.out.println(defaultGraph.toString());
        
        defaultGraph.setEdge(0, 1);
        defaultGraph.setEdge(1, 2);
        defaultGraph.setEdge(0, 2);
        
        System.out.println(defaultGraph.toString());
        
        //crear una instancia Graph, contrusctor vertices 
        System.out.println("Graph params constructor ------------");
        Graph paramGraph = new Graph(5);
        
        System.out.println(paramGraph.toString());
        
        
    }

}
