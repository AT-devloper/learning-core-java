// 7 Aug 2025
//  Graph

import java.util.*;

class Edge
{
    int src;
    int des;
    Edge(int src , int des)
    {
        this.src=src;
        this.des=des;
    }
}

class dc_6
{
public static void main(String ar[])
{
    
    ArrayList<Edge> Graph[] = new ArrayList[3];
    
    for(int i=0;i<Graph.length;i++)
    {
        Graph[i]=new ArrayList <Edge>();
    }

    Graph[0].add(new Edge(1,2));

    Graph[1].add(new Edge(2,1));
    Graph[1].add(new Edge(2,3));

    Graph[2].add(new Edge(3,2));
    

    for(int i=0;i<Graph.length;i++)
    {
        System.out.println(i+1);

    
for(Edge E : Graph[i])
{
    System.out.println(E.des);
    
}
System.out.println("--------------");
}
}
}
