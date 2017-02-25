package PriorityQueue;

/**
 * Created by Mingyuan Li on 2015/12/4.
 * Package: PriorityQueue
 * Project: Chapter6
 */
public class PrintDocument implements Comparable
{
    private String name;
    private int size;
    private int timeStamp;

    public PrintDocument()
    {
        name = null;
        size = 0;
        timeStamp = 0;
    }
    public PrintDocument(String name, int size, int timeStamp)
    {
        this.name = name;
        this.size = size;
        this.timeStamp = timeStamp;
    }
    public int getSize()
    {
        return size;
    }
    public int getTimeStamp()
    {
        return timeStamp;
    }
    public int compareTo(Object name)
    {
        int comResult = this.name.compareTo((String) name);
        return comResult;
    }
}
