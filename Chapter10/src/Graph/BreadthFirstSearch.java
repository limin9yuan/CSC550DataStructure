package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Mingyuan Li on 2015/12/6.
 * Package: Graph
 * Project: Chapter10
 */
public class BreadthFirstSearch
{
    public static int[] breadthFirstSearch(Graph graph, int start)
    {
        Queue<Integer> theQueue = new LinkedList<Integer>();
        int[] parent = new int[graph.getNumV()];
        for (int i = 0; i < graph.getNumV(); i++)
            parent[i] = -1;
        boolean[] identified = new boolean[graph.getNumV()];
        identified[start] = true;
        theQueue.offer(start);
        while (!theQueue.isEmpty())
        {
            int current = theQueue.remove();
            Iterator<Edge> iter = graph.edgeIterator(current);
            while (iter.hasNext())
            {
                Edge edge = iter.next();
                int neighbor = edge.getDest();
                if (!identified[neighbor])
                {
                    identified[neighbor] = true;
                    theQueue.offer(neighbor);
                    parent[neighbor] = current;
                }
            }
        }
        return parent;
    }
}
