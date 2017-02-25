package Graph;

import java.util.Iterator;

/**
 * Created by Mingyuan Li on 2015/12/6.
 * Package: Graph
 * Project: Chapter10
 */
public interface Graph
{
    int getNumV();
    boolean isDirected();
    void insert(Edge edge);
    boolean isEdge(int source, int dest);
    Edge getEdge(int source, int dest);
    Iterator<Edge> edgeIterator(int source);
}
