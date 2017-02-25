package PriorityQueue;

import java.util.Comparator;

/**
 * Created by Mingyuan Li on 2015/12/4.
 * Package: PriorityQueue
 * Project: Chapter6
 */
public class ComparePrintDocuments implements Comparator<PrintDocument>
{
    private static final double SIZE = 0.8;
    private static final double TIME = 0.2;

    public int compare(PrintDocument left, PrintDocument right)
    {
        return Double.compare(orderValue(left), orderValue(right));
    }
    private double orderValue(PrintDocument pd)
    {
        return SIZE * pd.getSize() + TIME * pd.getTimeStamp();
    }
}
