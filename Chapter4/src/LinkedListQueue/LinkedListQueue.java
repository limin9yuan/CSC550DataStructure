package LinkedListQueue;

import java.util.*;

/**
 * Created by Mingyuan Li on 2015/12/1.
 * Package: LinkedListQueue
 * Project: Chapter4
 */

public class LinkedListQueue<E> extends AbstractQueue<E> implements Queue<E>
{
    private LinkedList<E> theQueue = new LinkedList<E>();

    public boolean offer(E obj)
    {
        theQueue.addLast(obj);
        return true;
    }
    public E remove()
    {
        if (theQueue.isEmpty())
            throw new NoSuchElementException();
        else
            return theQueue.remove(0);
    }
    public E poll()
    {
        if (theQueue.isEmpty())
            return null;
        else
            return theQueue.remove(0);
    }
    public E peek()
    {
        if (theQueue.isEmpty())
            return null;
        else
            return theQueue.getFirst();
    }
    public E element()
    {
        if (theQueue.isEmpty())
            throw new NoSuchElementException();
        else
            return theQueue.getFirst();
    }
    public Iterator<E> iterator()
    {
        return theQueue.iterator();
    }
    public int size()
    {
        return theQueue.size();
    }
}
