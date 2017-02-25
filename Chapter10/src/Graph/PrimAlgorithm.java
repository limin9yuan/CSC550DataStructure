package Graph;

import java.util.*;

/**
 * Created by Mingyuan Li on 2015/12/7.
 * Package: Graph
 * Project: Chapter10
 */
public class PrimAlgorithm
{
    public static ArrayList<Edge> primsAlgorithm(Graph graph, int start)
    {
        ArrayList<Edge> result = new ArrayList<Edge>();
        int numV = graph.getNumV();
        Set<Integer> vMinusS = new HashSet<Integer>(numV);
        Queue<Edge> pq = new PriorityQueue<Edge>(numV, new CompareEdge());
        for (int i = 0; i < numV; i++)
        {
            if (i != start)
                vMinusS.add(i);
        }
        int current = start;
        while (vMinusS.size() != 0)
        {
            Iterator<Edge> iter = graph.edgeIterator(current);
            while (iter.hasNext())
            {
                Edge edge = iter.next();
                int dest = edge.getDest();
                if (vMinusS.contains(dest))
                    pq.add(edge);
            }
            int dest = -1;
            Edge edge = null;
            do
            {
                edge = pq.remove();
                dest = edge.getDest();
            }
            while (!vMinusS.contains(dest));
            vMinusS.remove(dest);
            result.add(edge);
            current = dest;
        }
        return result;
    }
}
