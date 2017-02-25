package Graph;

import java.util.Comparator;

/**
 * Created by Mingyuan Li on 2015/12/7.
 * Package: Graph
 * Project: Chapter10
 */
public class CompareEdge implements Comparator<Edge>
{
    /**
     *
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Edge o1, Edge o2) {
        if (o1.getWeight() < o2.getWeight())
            return -1;
        else if (o1.getWeight() == o2.getWeight())
            return 0;
        else
            return 1;
    }
}
