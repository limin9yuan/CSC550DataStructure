package Graph;

import java.util.*;

/**
 * Created by Mingyuan Li on 2015/12/6.
 * Package: Graph
 * Project: Chapter10
 */
public class DepthFirstSearch
{
    private Graph graph;
    private int[] parent;
    private boolean[] visited;
    private int[] discoveryOrder;
    private int[] finishOrder;
    private int discoverIndex;
    private int finishIndex;

    public DepthFirstSearch(Graph graph)
    {
        this.graph = graph;
        int n = graph.getNumV();
        parent = new int[n];
        visited = new boolean[n];
        discoveryOrder = new int[n];
        finishOrder = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = -1;
        for (int i = 0; i < n; i++)
        {
            if (!visited[i])
                depthFirstSearch(i);
        }
    }
    public DepthFirstSearch(Graph graph, int[] order)
    {
        this.graph = graph;
        int n = graph.getNumV();
        parent = new int[n];
        visited = new boolean[n];
        discoveryOrder = new int[n];
        finishOrder = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = -1;
        for (int i = 0; i < n; i++)
        {
            if (!visited[order[i]])
                depthSearch(order[i]);
        }
    }
    private void depthFirstSearch(int current)
    {
        visited[current] = true;
        discoveryOrder[discoverIndex++] = current;
        Iterator<Edge> iter = graph.edgeIterator(current);
        while (iter.hasNext())
        {
            int neighbor = iter.next().getDest();
            if (!visited[neighbor])
            {
                parent[neighbor] = current;
                depthFirstSearch(neighbor);
            }
        }
        finishOrder[finishIndex++] = current;
    }
    private void depthSearch(int current)
    {
        Stack<Integer> intStack = new Stack<Integer>();
        intStack.push(current);
        while (!intStack.empty())
        {
            current = intStack.pop();
            visited[current] = true;
            discoveryOrder[discoverIndex++] = current;
            Iterator<Edge> iter = graph.edgeIterator(current);
            while (iter.hasNext())
            {
                int neighbor = iter.next().getDest();
                while (!visited[neighbor])
                {
                    visited[neighbor] = true;
                    intStack.push(neighbor);
                    parent[neighbor] = current;
                }
            }
            finishOrder[finishIndex++] = current;
        }
    }
    public int[] getParent()
    {
        return parent;
    }
    public boolean[] getVisited()
    {
        return visited;
    }
    public int[] getDiscoveryOrder()
    {
        return discoveryOrder;
    }
    public int[] getFinishOrder()
    {
        return finishOrder;
    }
}
