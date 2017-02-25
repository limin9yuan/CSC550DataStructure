package Graph;

/**
 * Created by Mingyuan Li on 2015/12/6.
 * Package: Edge
 * Project: Chapter10
 */
public class Edge
{
    private int dest;
    private int source;
    private double weight;

    public Edge(int source, int dest)
    {
        this.source = source;
        this.dest = dest;
        this.weight = 1.0;
    }
    public Edge(int source, int dest, double weight)
    {
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        else
        {
            Edge newEdge = (Edge) other;
            return (source == newEdge.source && dest == newEdge.dest && weight == newEdge.weight);
        }
    }
    public int getDest()
    {
        return dest;
    }
    public int getSource()
    {
        return source;
    }
    public double getWeight()
    {
        return weight;
    }
    public int hashCode()
    {
        return source + dest;
    }
    public String toString()
    {
        return ("Source: " + source + "\n" +
                "Destination: " + dest + "\n" +
                "Weight: " + weight);
    }
}
