package Graph;

/**
 * Created by Mingyuan Li on 2015/12/6.
 * Package: Graph
 * Project: Chapter10
 */
public abstract class AbstractGraph implements Graph
{
    private int numV;
    private boolean directed;

    public AbstractGraph(int numV, boolean directed)
    {
        this.numV = numV;
        this.directed = directed;
    }
    public int getNumV()
    {
        return numV;
    }
    public boolean isDirected()
    {
        return directed;
    }
}
